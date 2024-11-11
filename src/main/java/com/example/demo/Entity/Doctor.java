package com.example.demo.Entity;

import org.springframework.data.annotation.Transient;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="doctor")
@Data
public class Doctor {
	@Column(name="docId")
	@Id
@SequenceGenerator(name="gen1",sequenceName = "CNO_SEQ",initialValue = 1001,allocationSize =1)
	@GeneratedValue(generator = "gen1", strategy =GenerationType.SEQUENCE)
	private Integer docId;
	@Column(name="name")
	private String name;
	@Column(name="specialization")
	private String specialization;
	@Transient
	@Column(name="income")
	private Double income;
	
	

}
