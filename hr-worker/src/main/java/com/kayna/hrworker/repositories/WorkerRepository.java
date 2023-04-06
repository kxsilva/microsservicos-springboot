package com.kayna.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kayna.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
