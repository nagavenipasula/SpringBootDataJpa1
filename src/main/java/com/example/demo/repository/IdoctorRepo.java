package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Entity.Doctor;

public interface IdoctorRepo extends CrudRepository<Doctor, Integer>{

}
