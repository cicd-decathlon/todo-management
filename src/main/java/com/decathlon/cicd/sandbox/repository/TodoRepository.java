package com.decathlon.cicd.sandbox.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.decathlon.cicd.sandbox.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
	List<Todo> findByUserName(String user);
}
