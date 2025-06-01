package com.payment.securepay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.payment.securepay.entity.UsersTable;

@Repository
public interface UserRespository extends JpaRepository<UsersTable,Long > {
	//@Query("Select u from users u where u.username =:username")
	boolean existsByuserName(String username);
}
