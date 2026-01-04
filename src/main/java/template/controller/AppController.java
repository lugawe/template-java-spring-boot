package template.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import template.service.AppService;

@RestController
public class AppController {

    @Autowired
    private AppService appService;

    public AppController() {}

    @GetMapping("/hello")
    public String hello() {
        return appService.getHelloWorld();
    }
}
