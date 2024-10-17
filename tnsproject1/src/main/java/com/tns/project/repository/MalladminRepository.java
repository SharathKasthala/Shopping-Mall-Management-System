package com.tns.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tns.project.entity.Malladmin;

@Repository
public interface MalladminRepository extends JpaRepository<Malladmin, Long>{

}
