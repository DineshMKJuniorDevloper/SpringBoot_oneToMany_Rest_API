package com.example.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Users;



public interface UserRepository extends JpaRepository<Users, Long>{

}
