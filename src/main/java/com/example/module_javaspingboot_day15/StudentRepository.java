package com.example.module_javaspingboot_day15;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface StudentRepository extends ReactiveCrudRepository<Student,Long> {
}
