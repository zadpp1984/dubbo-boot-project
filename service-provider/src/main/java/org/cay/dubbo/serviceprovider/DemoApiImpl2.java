package org.cay.dubbo.serviceprovider;

import org.apache.dubbo.config.annotation.Service;
import org.cay.dubbo.api.DemoApi2;
import org.springframework.beans.factory.annotation.Value;

@Service(version = "1.0.0")
public class DemoApiImpl2 implements DemoApi2 {

    @Value("${dubbo.protocol.name}")
    private String name;

    @Override
    public String getString() {
        return String.format("name:%s", name);
    }
}
