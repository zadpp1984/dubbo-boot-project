package org.cay.dubbo.serviceprovider;

import org.apache.dubbo.config.annotation.Service;
import org.cay.dubbo.api.DemoApi;
@Service(version = "1.0.1")
public class DemoApiImpl1 implements DemoApi {

    @Override
    public String getString() {
        return "abc";
    }
}
