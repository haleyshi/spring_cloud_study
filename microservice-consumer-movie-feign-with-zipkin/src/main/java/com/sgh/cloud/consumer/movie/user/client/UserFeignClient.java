/**
 * 
 */
package com.sgh.cloud.consumer.movie.user.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sgh.cloud.consumer.movie.user.entity.User;

/**
 * @author eguoshi
 * 
 * 使用@FeignClient("microservice-provider-user")注解绑定microservice-provider-user服务，还可以使用url参数指定一个URL。
 *
 */
@FeignClient(name = "microservice-provider-user-with-zipkin")
public interface UserFeignClient {
	@RequestMapping("/{id}")
	public User findById(@RequestParam("id") Long id);
}
