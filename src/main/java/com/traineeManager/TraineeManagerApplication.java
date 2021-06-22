package com.traineeManager;
import java.util.Scanner;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.traineeManager.model.Trainee;
import com.traineeManager.service.TraineeService;

@SpringBootApplication
public class TraineeManagerApplication {

	public static void main(String[] args) {
		
	ApplicationContext ctx=	SpringApplication.run(TraineeManagerApplication.class, args);
	}
}
