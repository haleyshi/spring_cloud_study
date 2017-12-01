/**
 * 
 */
package com.sgh.cloud.service.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author eguoshi
 * 使用Eureka做服务发现
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
	}

}
