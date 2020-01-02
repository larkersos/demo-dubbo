package org.apache.dubbo.demo.provider.impl;

import org.apache.dubbo.demo.DemoService;
import org.springframework.stereotype.Service;

/**
 * mplement interface in service provider
 */
@Service(value = "demoService")
@org.apache.dubbo.config.annotation.Service(interfaceName = "demoService",version = "1.0.0")
public class DemoDubboServiceImpl implements DemoService {
    /**
     *
     * @param name
     * @return
     */
    public String sayHello(String name) {
        return "Hello " + name;
    }

}
