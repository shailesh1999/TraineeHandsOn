package com.traineeManager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.traineeManager.model.Trainee;
@Repository
public interface ITraineeRepository extends JpaRepository <Trainee,Integer>{

	public List<Trainee> findByName(String name);

}
