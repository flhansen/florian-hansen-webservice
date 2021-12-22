package com.florianhansen.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.florianhansen.webservice.data.Project;
import com.florianhansen.webservice.data.ProjectRepository;

@RestController
public class ProjectController {
	
	@Autowired
	private ProjectRepository projectRepo;
	
	@RequestMapping("/projects")
	public List<Project> getProjects() {
		return projectRepo.findAll();
	}
	
	@GetMapping("/projects/{id}")
	public Project getProject(@PathVariable Integer id) {
		return projectRepo.getOne(id);
	}
	
}
