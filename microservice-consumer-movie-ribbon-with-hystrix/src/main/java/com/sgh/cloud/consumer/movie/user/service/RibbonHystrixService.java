/**
 * 
 */
package com.sgh.cloud.consumer.movie.user.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sgh.cloud.consumer.movie.user.entity.User;

/**
 * @author eguoshi
 *
 */
@Service
public class RibbonHystrixService {
	@Autowired
	private RestTemplate restTemplate;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(RibbonHystrixService.class);
	
	@HystrixCommand(fallbackMethod = "fallback")
	public User findById(Long id) {
		// URL: http://服务提供者的serviceId/url
		return this.restTemplate.getForObject("http://microservice-provider-user/" + id, User.class);
	}
	
	public User fallback(Long id) {
		RibbonHystrixService.LOGGER.info("异常发生，进入fallback方法，接收的参数：id = {}", id);
		User user = new User();
		user.setId(-1L);
		user.setUsername("Gutst_" + id);
		user.setAge(0);
		return user;
	}
}
