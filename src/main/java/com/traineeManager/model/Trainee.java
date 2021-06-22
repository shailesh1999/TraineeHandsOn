package com.traineeManager.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="trainee")
@Getter  @Setter
@NoArgsConstructor
@ToString
public class Trainee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empId;
	private String name;
	@Pattern(regexp="[A-Z]{3}[0-9]{2}[A-Z]{2}[0-9]{2}",message="cohort code should be filled in specified format")
	private String cohort_code;
	private String email;
	public Trainee(String name,String cohort_code,String email) {
		super();
		this.name = name;
		this.cohort_code = cohort_code;
		this.email = email;
	}
}
