package com.cts.handson.repository;

import java.util.List;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.handson.bean.Skills;


public interface UserRepository extends JpaRepository<Skills, Long> {

	Optional<Skills> findByName(String name);

	List<Skills> findByDescription(String Description);
	List<Skills> findByLevel(String Level);
}