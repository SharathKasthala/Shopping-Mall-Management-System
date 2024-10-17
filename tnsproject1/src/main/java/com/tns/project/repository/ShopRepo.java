package com.tns.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tns.project.entity.Shop;

@Repository
public interface ShopRepo extends JpaRepository<Shop, Long> {

}
