package com.example.demo;

import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface TaskRepository extends CrudRepository<Task, Integer>{
	@Modifying
	@Transactional
	@Query(value = "update task t set t.task_name = :newTask where t.task_name = :origTask", nativeQuery = true)
	int editTaskInDB(@Param("origTask")String origTask ,@Param("newTask") String newTask);
}
