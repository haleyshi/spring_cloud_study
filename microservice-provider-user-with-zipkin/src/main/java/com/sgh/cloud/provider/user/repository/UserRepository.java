/**
 * 
 */
package com.sgh.cloud.provider.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgh.cloud.provider.user.domain.User;

/**
 * @author eguoshi
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
