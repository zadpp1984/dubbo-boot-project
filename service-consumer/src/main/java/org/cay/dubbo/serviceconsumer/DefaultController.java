package org.cay.dubbo.serviceconsumer;

import org.apache.dubbo.config.annotation.Reference;
import org.cay.dubbo.api.DemoApi1;
import org.cay.dubbo.api.DemoApi2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @Reference(version = "1.0.0")
    private DemoApi1 demoApiImpl;
    @Reference(version = "1.0.1")
    private DemoApi1 demoApiImpl1;
    @Reference(version = "1.0.0")
    private DemoApi2 demoApiImpl2;

    @GetMapping("/getString1")
    private String getString1() {
        return demoApiImpl.getString();
    }

    @GetMapping("/getString2")
    private String getString2() {
        return demoApiImpl1.getString();
    }

    @GetMapping("/getString3")
    private String getString3() {
        return demoApiImpl2.getString();
    }
}
