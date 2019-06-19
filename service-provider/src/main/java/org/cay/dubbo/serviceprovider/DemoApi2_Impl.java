package org.cay.dubbo.serviceprovider;

import org.apache.dubbo.config.annotation.Service;
import org.cay.dubbo.api.DemoApi2;
import org.springframework.beans.factory.annotation.Value;

@Service(version = "1.0.0")
public class DemoApi2_Impl implements DemoApi2 {

    @Value("${display.msg3}")
    private String msg;

    @Override
    public String getString() {
        return String.format("msg:%s", msg);
    }
}
