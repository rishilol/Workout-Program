const { app, BrowserWindow } = require('electron')
const { path } = require('path')

cosnt PORT = 8080;
const DEFAULT_WINDOW_TITLE  = 'Workout Program'
const DEFAULT_WINDOW_WIDTH  = 640;
const DEFAULT_WINDOW_HEIGHT = 480;

let win;
let server_process;

function create_window() 
{
    let platform = process.platform;

    if (platform === 'win32') {
        server_process = require('child_process')
            .spawn('cmd.exe', ['/c', 'demo.bat'], {
                cwd: app.getAppPath() + '/demo/bin'
            });
    }

    else {
        server_process = require('child_process')
            .spawn(app.getAppPath() + '/demo/bin/demo');
    }

    if (!server_process) {
        console.error('Unable to start server from ' + 
            app.getAppPath());
        app.quit();
        return;
    }

    server_process.stdout.on('data', 
        data => console.log('server: ' + data));

    console.log('Server PID: ' + server_process.pid);
    
    const app_url = 'http://localhost:' + PORT;

    const openWindow = function (): void 
    {
        main_window = new BrowserWindow({
            title:  DEFAULT_WINDOW_TITLE,
            width:  DEFAULT_WINDOW_WIDTH,
            height: DEFAULT_WINDOW_HEIGHT
        });

        main_window.loadURL(app_url);
        main_window.on('closed', function () {
            main_window = null;
        });
        
        main_window.on('close', function (e) {
            if (server_process) {
                e.preventDefault();

                // end java executable
                const kill = require('tree-kill');
                kill(server_process.pid, 'SIGTERM', function () {
                    console.log('Server process killed');
                    server_process = null;
                    main_window.close();
                });
            }
        });
    }

    const start_up = function (): void
    {
        const request_promise = require('minimal-request-promise');

        request_promise.get(app_url).then(
            function (response) {
                console.log('Server Started');
                open_window();
            },

            function (response) {
                console.log('Waiting for the server to start...');

                setTimeout(function () {
                    start_up();
                }, 200);
            }
        );
    }

    start_up();
}

app.on('ready', create_window);
app.on('window-all-closed', () => {
    if (process.platform !== 'darwin') {
        app.quit();
    }
});

app.on('activate', () => {
    if (win === null) {
        create_window();
    }
});
