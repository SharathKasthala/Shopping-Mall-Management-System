package com.tns.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tns.project.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

}
