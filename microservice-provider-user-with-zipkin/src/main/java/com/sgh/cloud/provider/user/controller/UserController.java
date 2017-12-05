/**
 * 
 */
package com.sgh.cloud.provider.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sgh.cloud.provider.user.domain.User;
import com.sgh.cloud.provider.user.repository.UserRepository;

/**
 * @author eguoshi
 *
 */
@RestController
public class UserController {
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@Autowired
	private UserRepository userRepository;
	
	/**
	 * equals to @RequestMapping(value = "/id", method = RequestMethod.GET)
	 * @param id
	 * @return user
	 */
	@GetMapping("/{id}")
	public User findById(@PathVariable Long id) {
		User findOne = this.userRepository.findOne(id);
		return findOne;
	}
	
	@GetMapping("/instance-info")
	public ServiceInstance showInfo() {
		ServiceInstance localServiceInstance = this.discoveryClient.getLocalServiceInstance();
		return localServiceInstance;
	}

}
