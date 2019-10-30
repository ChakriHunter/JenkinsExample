package com.example.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.StudentEntity;
@Repository
public interface StudentRepo extends CrudRepository<StudentEntity, Integer> {

}
