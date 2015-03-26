package com.terry.logback;


import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author terry
 */
public class HelloWorld {
    public static void main(String[] s) {
        Logger logger = LoggerFactory.getLogger(HelloWorld.class);
        logger.debug("hello world!");

        //print internal state
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);
    }
}
