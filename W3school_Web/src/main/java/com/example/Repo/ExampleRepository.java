package com.example.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.ExampleEntity;

public interface ExampleRepository extends JpaRepository<ExampleEntity, Long> {

}
