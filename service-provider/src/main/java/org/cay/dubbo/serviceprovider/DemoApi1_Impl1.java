package org.cay.dubbo.serviceprovider;


import org.apache.dubbo.config.annotation.Service;
import org.cay.dubbo.api.DemoApi1;
import org.springframework.beans.factory.annotation.Value;

@Service(version = "1.0.0")
public class DemoApi1_Impl1 implements DemoApi1 {

    @Value("${display.msg1}")
    private String msg;

    @Override
    public String getString() {
        return String.format("msg:%s", msg);
    }
}
