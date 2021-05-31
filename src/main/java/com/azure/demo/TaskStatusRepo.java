package com.azure.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskStatusRepo extends JpaRepository<TaskStatus, Long> {

}
