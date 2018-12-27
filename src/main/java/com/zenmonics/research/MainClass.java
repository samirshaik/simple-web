package com.zenmonics.samir;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MainClass {
    private static final Log log = LogFactory.getLog(MainClass.class);

    public static void main(String[] args) {
        log.debug("Hello from commons-logging : DEBUG");
        log.info("Hello from commons-logging : INFO");
        log.warn("Hello from commons-logging : WARN");
        log.error("Hello from commons-logging : ERROR");
        log.fatal("Hello from commons-logging : FATAL");
        log.trace("Hello from commons-logging : TRACE");
    }
}
