package com.example.demo;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.Entity.Doctor;
import com.example.demo.service.IDoctorService;

@SpringBootApplication
public class SpringBootDataJpa1Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringBootDataJpa1Application.class, args);
	    IDoctorService service=ctx.getBean("docservice",IDoctorService.class);
	    try {
	    	
//	    	Doctor doctor=new Doctor();
//	    				1doctor.setName("sindhu");
//	    	doctor.setIncome(2300000.0);
//	    	doctor.setSpecialization("teacher");
//	    	//save the object
//	    	String resultmsg=service.registerDoctor(doctor);
//	    	System.out.println(resultmsg);
	    	
//	    	//checking the availbality of doctor
//	    	Boolean flag=service.isDoctoravailable(3);
//	    	service.showalldoctors().forEach(System.out::println);
//	    	System.out.println("flag="+flag);
	    	
	    	//getting the dotcos list
//	    	
//	    	Doctor doctor=service.fidnById();
//	    	System.out.println(" doctor==="+doctor.toString());
	    	
	 
	    	//updating the doctor detai;s
	    	
//	    	Optional<Doctor> doctor=service.fidnByIdOptional();
//	    	Doctor doctor1=doctor.get();
//	    	doctor1.setIncome(90000.0);
//	    	System.out.println(" doctor==="+doctor.toString());
//	    	
//	    	String resultmsg=service.registerDoctor(doctor1);
//	    	System.out.println(resultmsg);
	    	
	    	
	    	//deleting the record
//	    	System.out.println(" doctor==="+service.DeleteId());
//	    	//delete by entity
//	    	Optional<Doctor> doctor=service.fidnByIdOptional();
//	    	Doctor doctor1=doctor.get();
//	    	
//	    	service.DeleteId();
//	    	service.DeleteById(103);
	    	
	    	//showall records
	    	service.showalldoctors().forEach(s->{System.out.println(s.toString());});;
	    	
	    }
	    catch (Exception e) {
			// TODO: handle exception
	    	e.printStackTrace();
		}
	}

}
