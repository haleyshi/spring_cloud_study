/**
 * 
 */
package com.sgh.cloud.dashboard;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author eguoshi
 *
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new SpringApplicationBuilder(HystrixDashboardApplication.class).web(true).run(args);
	}

}
