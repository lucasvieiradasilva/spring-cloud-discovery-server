package br.com.unnamed.spring_cloud_discovery_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudDiscoveryServerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDiscoveryServerApplication.class, args);
	}
}
