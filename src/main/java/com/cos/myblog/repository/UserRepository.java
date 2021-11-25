package com.cos.myblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.myblog.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
