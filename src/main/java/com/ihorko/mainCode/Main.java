package com.ihorko.mainCode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Runnable loggerError = () -> logger.error("Error...");
        Runnable loggerFatal = () -> logger.fatal("Fatal...");


        logger.trace("Trace...");
        logger.debug("Debug...");
        logger.info("Info...");
        logger.warn("Warn...");
        loggerError.run();
//        loggerFatal.run();
    }

}
