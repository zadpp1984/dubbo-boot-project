package org.cay.dubbo.serviceprovider;


import org.apache.dubbo.config.annotation.Service;
import org.cay.dubbo.api.DemoApi;
import org.springframework.beans.factory.annotation.Value;

@Service(version = "1.0.0")
public class DemoApiImpl implements DemoApi {

    @Value("${dubbo.protocol.port}")
    private String port;

    @Override
    public String getString() {
        return String.format("port:%s", port);
    }
}
