package com.xoriant.MusicApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.xoriant.MusicApp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

	@Query(value="select * from user where u_name=:name", nativeQuery = true)
	User findAllByName(String name);

}
