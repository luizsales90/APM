package br.ufal.ic.p3.collaborator;

import java.util.ArrayList;
import br.ufal.ic.p3.academicproduction.*;
import java.util.List;

import br.ufal.ic.p3.*;

//Foi utilizada classe abstrata j� que nome e e-mail
//s�o utilizados tanto para alunos quanto para professores e pesquisadores
public abstract class Collaborator {
	
	private String name;
	private String email; 
	private List<Publication> publications = new ArrayList<Publication>();
	private List<Project> projects = new ArrayList<Project>();
	
	public Collaborator(String name,String email){
		this.name = name;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
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

	
// Relat�rio com nome, email, projetos e produ��o acad�mica vinculados
// a um colaborador(aluno ou professor)	
	public void report(){
		System.out.println("Nome: "+this.getName()+
				"\nEmail: "+this.getEmail()+
				"\nLista de projetos: "+this.getProjects()+
				"\nProducao Academica: "+this.getPublications()
				);
		
	}
}
