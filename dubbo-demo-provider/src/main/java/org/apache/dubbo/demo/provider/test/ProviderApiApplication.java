package org.apache.dubbo.demo.provider.test;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;
import org.apache.dubbo.demo.DemoService;
import org.apache.dubbo.demo.provider.impl.DemoDubboServiceImpl;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Bootstrap the service provider
 */
@SpringBootApplication
public class ProviderApiApplication {
    public static void main(String[] args) throws Exception {
        DemoService demoService = new DemoDubboServiceImpl();
        // Application Info
        ApplicationConfig application = new ApplicationConfig();
        application.setName("dubbo");
        // Registry Info
        RegistryConfig registry = new RegistryConfig();
        registry.setAddress("multicast://224.5.6.7:1234");
//        registry.setUsername("aaa");
//        registry.setPassword("bbb");

        // Protocol
        ProtocolConfig protocol = new ProtocolConfig();
        protocol.setName("dubbo");
//        protocol.setPort(12345);
//        protocol.setThreads(200);


        // Exporting
        ServiceConfig<DemoService> service = new ServiceConfig<DemoService>(); // In case of memory leak, please cache.
        service.setApplication(application);
        service.setRegistry(registry); // Use setRegistries() for multi-registry case
        service.setProtocol(protocol); // Use setProtocols() for multi-protocol case
        service.setInterface(DemoService.class);
        service.setRef(demoService);
        service.setVersion("1.0.0");

// Local export and register
        service.export();
    }
}
