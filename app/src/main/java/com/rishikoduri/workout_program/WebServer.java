import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.servlet.ServletHandler;
import org.eclipse.jetty.util.thread.QueuedTheadPool;

// https://www.baeldung.com/jetty-embedded

public class WebServer 
{
    private final static Server web_server;

    private static void server_start() throws Exception
    {
        QueuedThreadPool thread_pool = new QueuedThreadPool(
            Config.MAX_THREADS, 
            Config.MIN_THREADS, 
            Config.IDLE_TIMEOUT);

        web_server = new Server(thread_pool);
        final ServerConnector connector = new ServerConnector(server);
        connector.setPort(Config.PORT);
        web_server.setConnectors(new Connector[] { connector });

        ServletHandler servlet_handler = new ServletHandler();
        web_server.setHandler(servlet_handler);
    }

    private static void server_stop() throws Exception
    {
        web_server.stop();
    }
}
