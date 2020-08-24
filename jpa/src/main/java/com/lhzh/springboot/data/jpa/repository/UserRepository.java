package com.lhzh.springboot.data.jpa.repository;

import com.lhzh.springboot.data.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
