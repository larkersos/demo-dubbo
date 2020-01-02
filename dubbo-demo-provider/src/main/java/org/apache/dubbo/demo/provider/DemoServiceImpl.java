package org.apache.dubbo.demo.provider;

import org.apache.dubbo.demo.DemoService;

/**
 * mplement interface in service provider
 */
public class DemoServiceImpl implements DemoService {
    /**
     *
     * @param name
     * @return
     */
    public String sayHello(String name) {
        return "Hello " + name;
    }

}
