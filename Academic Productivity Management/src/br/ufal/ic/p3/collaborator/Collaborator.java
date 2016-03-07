package br.ufal.ic.p3.collaborator;

import java.util.ArrayList;
import br.ufal.ic.p3.academicproduction.*;
import java.util.List;

import br.ufal.ic.p3.IdGenerator;

import br.ufal.ic.p3.*;

public abstract class Collaborator {
	
	private String name;
	private String email; 
//	protected int id;
	private List<Publication> publications = new ArrayList<Publication>();
	private List<Project> projects = new ArrayList<Project>();
	
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
	
	public List<Project> getProjects() {
		return projects;
	}
	public void addProject(Project project) {		
		projects.add(project);
	}

	public String toString(){
		return name;		
	}
	
	public void report(){
		System.out.println("Nome: "+this.getName()+
				"\nEmail: "+this.getEmail()+
				"\nLista de projetos: "+this.getProjects()+
				"\nProducao Academica: "+this.getPublications()
				);
		
	}
}
