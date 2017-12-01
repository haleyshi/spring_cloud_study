/**
 * 
 */
package com.sgh.cloud.consumer.movie.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sgh.cloud.consumer.movie.user.client.UserFeignClient;
import com.sgh.cloud.consumer.movie.user.entity.User;

/**
 * @author eguoshi
 *
 */
@RestController
public class FeignController {
	@Autowired
	private UserFeignClient userFeignClient;
	
	@GetMapping("/feign/{id}")
	public User findById(@PathVariable Long id) {
		return this.userFeignClient.findById(id);
	}

}
