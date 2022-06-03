package com.example.demo;

//import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LombokLoggingController {

    @RequestMapping("/lombok")
    public String index() {
        log.trace("a trace message");
        log.debug("a debug message");
        log.info("an info message");
        log.warn("a warn message");
        log.error("an error message");

        return "Howdy! Check out the logs to see the output";
    }
}
