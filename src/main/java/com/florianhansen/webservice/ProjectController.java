package com.florianhansen.webservice;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.florianhansen.webservice.data.Project;
import com.florianhansen.webservice.data.ProjectRepository;

@RestController
public class ProjectController {
	
	@Autowired
	private ProjectRepository projectRepo;

	@RequestMapping("/hello")
	public String hello() {
		return "Hello World!";
	}
	
	@RequestMapping("/projects")
	public String projects() {
		List<Project> projects = projectRepo.findAll();
		List<String> projectNames = projects.stream()
											.map(p -> p.getDescription())
											.collect(Collectors.toList());

		return String.join(", ", projectNames);
	}
	
}
