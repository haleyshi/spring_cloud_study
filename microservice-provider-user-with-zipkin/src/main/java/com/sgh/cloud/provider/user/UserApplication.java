/**
 * 
 */
package com.sgh.cloud.provider.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author eguoshi
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UserApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}

}
