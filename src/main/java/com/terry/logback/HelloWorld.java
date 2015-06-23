package com.terry.logback;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author terry
 */
public class HelloWorld {
    public static void main(String[] s) {
        Logger logger = LoggerFactory.getLogger(HelloWorld.class);
        logger.info("hello world!");

        //print internal state
//        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
//        StatusPrinter.print(lc);
    }
}
