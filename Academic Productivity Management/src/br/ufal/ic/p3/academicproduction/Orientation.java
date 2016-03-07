package br.ufal.ic.p3.academicproduction;

import br.ufal.ic.p3.collaborator.*; 
public class Orientation {
	
	private Professor advisor;
	private Student student;
	private String title;
	
// Vinculando aluno e professor a uma orientação	
	public Orientation(String title,Professor advisor,Student student){
		this.title = title;
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

	public String getTitle() {
		return title;
	}
	
	public String toString(){
		return title;
	}

}
