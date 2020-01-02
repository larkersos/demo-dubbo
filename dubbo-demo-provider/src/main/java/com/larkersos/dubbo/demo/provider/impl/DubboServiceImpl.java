package com.larkersos.dubbo.demo.provider.impl;

import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.demo.DemoService;

/**
 * mplement interface in service provider
 */
@Service
//@org.apache.dubbo.config.annotation.Service(interfaceName = "org.apache.dubbo.demo.DemoService",version = "1.0.0")
public class DubboServiceImpl implements DemoService {
    /**
     *
     * @param name
     * @return
     */
    public String sayHello(String name) {
        return "Hello dubbo," + name;
    }

}
