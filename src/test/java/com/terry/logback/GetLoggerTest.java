package com.terry.logback;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author terry
 */
public class GetLoggerTest {

    @Test
    public void testLoggerGet() {
        Logger logger = LoggerFactory.getLogger(GetLoggerTest.class);
        logger.debug("hello world!");
    }
}
