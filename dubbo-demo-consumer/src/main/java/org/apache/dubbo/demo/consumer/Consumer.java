package org.apache.dubbo.demo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.dubbo.demo.DemoService;

/**
 * Bootstrap the consumer
 */
public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring/dubbo-demo-consumer.xml"});
        context.start();
        // Obtaining a remote service proxy
        DemoService demoService = (DemoService)context.getBean("demoService");
        // Executing remote methods
        String hello = demoService.sayHello("world，你好啊！currentTimeMillis:" + System.currentTimeMillis());
        // Display the call result
        System.out.println(hello);
    }
}
