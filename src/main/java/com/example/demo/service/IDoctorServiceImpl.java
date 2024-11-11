package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.hibernate.boot.model.naming.IllegalIdentifierException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Doctor;
import com.example.demo.repository.IdoctorRepo;
@Service("docservice")
public class IDoctorServiceImpl implements IDoctorService {

	@Autowired
	IdoctorRepo idoctorRepo;
	
	@Override
	public String registerDoctor(Doctor doctor) {
	Doctor doc=idoctorRepo.save(doctor);
		return "Doctor obj is saved with id value"+doc.getDocId();
	}

	@Override
	public Boolean isDoctoravailable(Integer id) {
		// TODO Auto-generated method stub
		Boolean flag=idoctorRepo.existsById(id);
		return flag;
	}

	@Override
	public Iterable<Doctor> showalldoctors() {
		// TODO Auto-generated method stub
		return idoctorRepo.findAll();
//		ArrayList<Integer> list1=new ArrayList<>();
//		list1.add(1);
//		list1.add(2);
//		list1.add(101);
//		return idoctorRepo.findAllById(list1);
	}

	@Override
	public Doctor fidnById() {
		
		// TODO Auto-generated method stub
//		Doctor doctor=new Doctor();
//		doctor.setSpecialization("hello");
		Doctor doctor=idoctorRepo.findById(104).orElseThrow(()->new IllegalIdentifierException("invalid id"));
		
		return idoctorRepo.findById(00
				).orElse(doctor);
	}

	@Override
	public Optional<Doctor> fidnByIdOptional() {
		// TODO Auto-generated method stub
		return idoctorRepo.findById(104);
	}

	@Override
	public String DeleteId() {
		// TODO Auto-generated method stub
		Optional<Doctor> doctor=idoctorRepo.findById(105);
		String msg=null;
		if(doctor.isEmpty())
		{
			msg=doctor.get().getDocId()+" id is not valid ";
		}
		else {
			msg=doctor.get().getDocId()+"id deleted successfully";
		}
		idoctorRepo.delete(doctor.get());
		return null;
	}

	@Override
	public void DeleteById(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("id  value delted"+id);
		Boolean flag=idoctorRepo.existsById(id);
		Long count=idoctorRepo.count();
		System.out.println("count=="+count);
		System.out.println("flag=="+flag);
//		 idoctorRepo.deleteById(id);
	}

}
