package com.example.demo.service;

import java.util.Optional;

import com.example.demo.Entity.Doctor;

public interface IDoctorService {
	public String registerDoctor(Doctor doctor);
	public Boolean isDoctoravailable(Integer id);
	public Iterable<Doctor> showalldoctors();
	public Doctor fidnById();
	public Optional<Doctor> fidnByIdOptional();
	public String DeleteId();
	public void DeleteById(Integer id);

}
