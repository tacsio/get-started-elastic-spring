package io.tacsio.spring.elastic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ElasticApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElasticApplication.class, args);
    }

}


@RestController
class SampleController {

    private final Logger log = LoggerFactory.getLogger(SampleController.class);

    @GetMapping
    public String index() {
        log.info("get mapping on /");

        return "ok";
    }
}