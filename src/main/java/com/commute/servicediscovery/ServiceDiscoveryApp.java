package com.commute.servicediscovery;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Slf4j
@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoveryApp {

    /**
     * default entry point
     *
     * @param args unused
     * @throws UnknownHostException
     */
    @SuppressWarnings("squid:S1313") // IP addresses should not be hardcoded => In this case it is ok
    public static void main(String[] args) throws UnknownHostException {
        SpringApplication app = new SpringApplication(ServiceDiscoveryApp.class);
        Environment env = app.run(args).getEnvironment();

        log.info(
                "\n----------------------------------------------------------\n\t" + "Application '{}' is running! Access URLs: \n\t"
                        + "Local: \t\thttp://127.0.0.1:{} \n\t" + "External: \thttp://{}:{}"
                        + "\n----------------------------------------------------------",
                env.getProperty("spring.application.name"), env.getProperty("server.port"), InetAddress.getLocalHost().getHostAddress(),
                env.getProperty("server.port"));
    }
}
