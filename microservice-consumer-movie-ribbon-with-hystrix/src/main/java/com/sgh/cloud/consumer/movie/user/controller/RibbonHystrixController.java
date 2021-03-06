/**
 * 
 */
package com.sgh.cloud.consumer.movie.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sgh.cloud.consumer.movie.user.entity.User;
import com.sgh.cloud.consumer.movie.user.service.RibbonHystrixService;

/**
 * @author eguoshi
 *
 */
@RestController
public class RibbonHystrixController {
	@Autowired
	private RibbonHystrixService ribbonHystrixService;
	
	@GetMapping("/ribbon/{id}")
	public User findById(@PathVariable Long id) {
		return this.ribbonHystrixService.findById(id);
	}

}
