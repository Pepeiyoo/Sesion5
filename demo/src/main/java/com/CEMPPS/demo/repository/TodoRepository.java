package com.CEMPPS.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CEMPPS.demo.model.Todo;



public interface TodoRepository extends JpaRepository < Todo, Long > {
    List < Todo > findByUserName(String user);
}