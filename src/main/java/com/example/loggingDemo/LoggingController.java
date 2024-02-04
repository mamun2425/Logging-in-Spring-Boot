package com.example.loggingDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

    Logger logger = LoggerFactory.getLogger(LoggingController.class);


    @RequestMapping("/home")
    public String home(){
        logger.error("there is an error");
        logger.trace("Trace Trace Trace!!! home accessed!");
        logger.info("Logger INFO!");
        logger.warn("Logger WARN!!!!!!");
        return "Hello from Logging Demo";
    }

}
