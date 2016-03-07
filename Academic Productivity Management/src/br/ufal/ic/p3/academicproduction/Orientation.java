package br.ufal.ic.p3.academicproduction;

import br.ufal.ic.p3.collaborator.*; 
import br.ufal.ic.p3.*;
public class Orientation {
	
	private Professor advisor;
	private Student student;
	
	public Orientation(Professor advisor,Student student){
		this.advisor = advisor;
		advisor.addOrientation(this);
		this.student = student;
		
	}

	public Student getStudent() {
		return student;
	}

	public Professor getAdvisor() {
		return advisor;
	}
	

}
