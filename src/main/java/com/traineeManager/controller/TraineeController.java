package com.traineeManager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.traineeManager.model.Trainee;
import com.traineeManager.service.TraineeService;

@Controller
public class TraineeController {
	@Autowired
	private TraineeService sService;
	
	@RequestMapping("/")
	public String allStudent(Model m) {
		List<Trainee> t=sService.getAllTrainee();
		m.addAttribute("TraineeList", t);
		return "index";
	}
	@RequestMapping(value="createTrainee", method=RequestMethod.POST)
	public String saveStudent(Trainee t) {
		System.out.println("=================="+t.getName());
		sService.createTrainee(t);
		return "redirect:/";
	}
	@RequestMapping(value="removeTrainee")
	public String deleteStudent(int empid) {
		sService.removeTrainee(empid);
		return "redirect:/";
	}

}
