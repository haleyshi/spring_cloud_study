/**
 * 
 */
package com.sgh.cloud.consumer.movie.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sgh.cloud.consumer.movie.user.entity.User;

/**
 * @author eguoshi
 *
 */
@Service
public class RibbonService {
	@Autowired
	private RestTemplate restTemplate;
	
	public User findById(Long id) {
		// URL: http://服务提供者的serviceId/url
		return this.restTemplate.getForObject("http://microservice-provider-user/" + id, User.class);
	}
}
