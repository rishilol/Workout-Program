package com.rishikoduri.workout_program;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Main {
    private static final Logger logger = 
        LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) 
    {
        log.info("Starting server..");
        
        server_start();

        log.info("Server stopped");
    }

    /* Getters */
    public static Logger get_logger() { return logger; }
}
