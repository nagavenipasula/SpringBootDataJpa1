//package com.example.demo.Entity;
//
//
//import java.util.Date;
//
//import org.springframework.data.annotation.Id;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.SequenceGenerator;
//import jakarta.persistence.Table;
//import jakarta.persistence.Transient;
//import lombok.Data;
//
//@Entity
//@Table(name = "User")
//@Data
//public class User {
//	@SequenceGenerator(name="gen1",sequenceName = "CNO_SEQ",initialValue = 1001,allocationSize =10)
//	@GeneratedValue(generator = "gen1", strategy =GenerationType.SEQUENCE)
//    @Id
//    private Integer id;
// 
//    private String email;
// 
//    private String password;
// 
//    @Transient
//    private Date loginTime;
//    
//    // getters and setters
//}
