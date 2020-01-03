package com.larkersos.dubbo.demo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Bootstrap the service provider
 */
@SpringBootApplication
//@EnableDubbo
@EnableAutoConfiguration
//@EnableDubbo(scanBasePackages  = {"com.larkersos.dubbo.demo.provider"})
//@ImportResource(locations="classpath:META-INF/spring/dubbo-demo-provider.xml")
public class ProviderApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ProviderApplication.class);
    }
}
