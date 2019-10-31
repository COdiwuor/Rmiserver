package com.rmi.rmiserver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;
import org.springframework.remoting.support.RemoteExporter;

@Configuration
public class ConfigServe {

    @Bean
    RemoteExporter RegisterRMIExporter(){
    RemoteExporter exporter = new RmiServiceExporter();
        ((RmiServiceExporter) exporter).setServiceName("SendMessageRMI");
        exporter.setServiceInterface(RMIService.class);
        exporter.setService(new RMIServiceImpl());
        return exporter;
    }
}
