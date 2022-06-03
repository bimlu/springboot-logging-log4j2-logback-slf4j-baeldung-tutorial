package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

//    Logger logger = LoggerFactory.getLogger(LoggingController.class);

    Logger logger = LogManager.getLogger(LoggingController.class);

    @RequestMapping("/")
    public String index() {
        logger.trace("a trace message");
        logger.debug("a debug message");
        logger.info("an info message");
        logger.warn("a warn message");
        logger.error("an error message");

        return "Howdy! Check out the logs to see the output";
    }
}
