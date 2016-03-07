package br.ufal.ic.p3.academicproduction;

import br.ufal.ic.p3.collaborator.*; 
import br.ufal.ic.p3.*;
public class Orientation {
	
	private Professor advisor;
	private Student student;
	private Project project;
	
	public Orientation(Professor advisor,Student student,Project project){
		this.advisor = advisor;
		advisor.addOrientation(this);
		this.student = student;
		this.project = project;		
		
	}

	public Project getProject() {
		return project;
	}

	public Student getStudent() {
		return student;
	}

	public Professor getAdvisor() {
		return advisor;
	}
	

}
