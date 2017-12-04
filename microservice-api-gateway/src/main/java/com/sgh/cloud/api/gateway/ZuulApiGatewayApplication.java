/**
 * 
 */
package com.sgh.cloud.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author eguoshi
 *
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApiGatewayApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ZuulApiGatewayApplication.class, args);
	}

}
