package com.smart.home.common.repository;

import com.smart.home.common.entity.Demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepository extends JpaRepository<Demo, String> {
}
