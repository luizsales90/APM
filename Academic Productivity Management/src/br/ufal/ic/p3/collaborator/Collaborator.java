package br.ufal.ic.p3.collaborator;

import java.util.ArrayList;
import br.ufal.ic.p3.academicproduction.*;
import java.util.List;

import br.ufal.ic.p3.IdGenerator;

import br.ufal.ic.p3.*;

public abstract class Collaborator {
	
	protected String name;
	protected String email;
//	protected int id;
	private List<Publication> publications = new ArrayList<Publication>();
//	private List<Project> projects = new ArrayList<Project>();
	public int numberOfProjects=0;
	
	public Collaborator(String name,String email){
		this.name = name;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public String getEmail() {
		return email;
	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public int getId() {
//		return id;
//	}
//	public void setId() {		
//		this.id = IdGenerator.getNextId();		
//	}
	public List<Publication> getPublications() {
		return publications;
	}
	public void addPublication(Publication publication) {		
		publications.add(publication);
	} 
	
//	public List<Project> getProjects() {
//		return projects;
//	}
//	public void addProjects(Project project) {		
//		projects.add(project);
//	}

}
