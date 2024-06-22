package com.ota.springboot.coding.exam.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ota.springboot.coding.exam.entity.NotesEntity;

@Repository
public interface NotesJpaRepository extends JpaRepository<NotesEntity, Integer>{

}
