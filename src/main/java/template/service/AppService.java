package template.service;

import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class AppService {

    private static final Logger log = LoggerFactory.getLogger(AppService.class);

    public AppService() {}

    public String getHelloWorld() {
        log.info("requested hello world");
        return "Hello World!";
    }
}
