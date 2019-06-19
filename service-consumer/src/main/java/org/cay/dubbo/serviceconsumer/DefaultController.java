package org.cay.dubbo.serviceconsumer;

import org.apache.dubbo.config.annotation.Reference;
import org.cay.dubbo.api.DemoApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @Reference(version = "1.0.0")
    private DemoApi demoApiImpl;
    @Reference(version = "1.0.1")
    private DemoApi demoApiImpl1;

    @GetMapping("/getString")
    private String getString(){
        return demoApiImpl.getString();
    }

    @GetMapping("/getString2")
    private String getString2(){
        return demoApiImpl1.getString();
    }
}
