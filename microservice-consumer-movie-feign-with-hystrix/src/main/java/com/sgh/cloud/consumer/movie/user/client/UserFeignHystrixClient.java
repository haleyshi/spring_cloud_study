/**
 * 
 */
package com.sgh.cloud.consumer.movie.user.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sgh.cloud.consumer.movie.user.entity.User;
import com.sgh.cloud.consumer.movie.user.client.UserFeignHystrixClient.HystrixClientFallback;

/**
 * @author eguoshi
 * 
 *         使用@FeignClient("microservice-provider-user")注解绑定microservice-provider-user服务，还可以使用url参数指定一个URL。
 *
 */
@FeignClient(name = "microservice-provider-user", fallback = HystrixClientFallback.class)
public interface UserFeignHystrixClient {
	@RequestMapping("/{id}")
	public User findById(@RequestParam("id") Long id);

	/*
	 * 这边采取了和Spring Cloud官方文档相同的做法，将fallback类作为内部类放入Feign的接口中，当然也可以单独写一个fallback类。
	 */
	@Component
	static class HystrixClientFallback implements UserFeignHystrixClient {
		private static final Logger LOGGER = LoggerFactory.getLogger(HystrixClientFallback.class);

		@Override
		public User findById(Long id) {
			HystrixClientFallback.LOGGER.info("异常发生，进入fallback方法，接收的参数：id = {}", id);
			User user = new User();
			user.setId(-1L);
			user.setUsername("Guest_" + id);
			user.setAge(0);
			return user;
		}
	}
}
