package com.ust.jwsre1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.jwsre1.Students;

public interface StudentRepo extends JpaRepository<Students, Integer> {

}
