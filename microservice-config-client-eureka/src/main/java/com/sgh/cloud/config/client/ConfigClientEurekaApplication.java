/**
 * 
 */
package com.sgh.cloud.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author eguoshi
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientEurekaApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientEurekaApplication.class, args);
	}

}
