/**
 * 
 */
package com.sgh.cloud.consumer.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author eguoshi
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
public class MovieFeignHystrixApplication {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(MovieFeignHystrixApplication.class, args);
	}

}
