package com.task1.Repo;

import com.task1.Entity.Hello;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloRepo extends JpaRepository<Hello, Integer> {
}