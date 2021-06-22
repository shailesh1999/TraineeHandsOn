package com.traineeManager.service;

import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traineeManager.model.Trainee;
import com.traineeManager.repository.ITraineeRepository;

@Service

public class TraineeService {
	Logger logger = LoggerFactory.getLogger(TraineeService.class);
	@Autowired
	private ITraineeRepository repo;

	public String createTrainee(Trainee t) {
			repo.saveAndFlush(t);
			return "Trainee Created!!!!";
	}

	public List<Trainee> getAllTrainee() {
		logger.info("Server is running on Port: {} ");
		logger.error("Error in Null Value");

		return repo.findAll();
	}

	public Trainee getTraineeById(int sid) {
		Optional<Trainee> op = repo.findById(sid);
		if (op.isPresent())
			return op.get();
		else
			return null;
	}

	public String removeTrainee(int tid) {
		Optional<Trainee> op = repo.findById(tid);
		if (op.isPresent()) {
			repo.delete(op.get());
			return "Trainee Deleted!!!!";
		} else {
			return "Trainee Not Available";
		}

	}

	public List<Trainee> findByTraineeName(String name) {
		return repo.findByName(name);
	}

}