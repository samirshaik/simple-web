package com.zenmonics.research.servlet;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

public class LogValidationServlet extends HttpServlet {
    private static final Log log = LogFactory.getLog(LogValidationServlet.class);

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        log.debug("Hello from commons-logging : DEBUG");
        log.info("Hello from commons-logging : INFO");
        log.warn("Hello from commons-logging : WARN");
        log.error("Hello from commons-logging : ERROR");
        log.fatal("Hello from commons-logging : FATAL");
        log.trace("Hello from commons-logging : TRACE");

        Writer writer = response.getWriter();
        writer.write("<html><head>><title>Validate Log Level</title></head><body><h2>Please check the logs on the server.</h2></body></html>");
        writer.flush();
    }
}
