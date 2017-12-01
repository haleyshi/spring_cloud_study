/**
 * 
 */
package com.sgh.cloud.dashboard;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author eguoshi
 *
 */
@SpringBootApplication
@EnableTurbine
public class TurbineApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new SpringApplicationBuilder(TurbineApplication.class).web(true).run(args);
	}

}
