package br.ufal.ic.p3.academicproduction;
import br.ufal.ic.p3.Project;

import java.util.ArrayList;
import java.util.List;
import br.ufal.ic.p3.collaborator.*;

public class Publication {
	
	private String title, conference;
	private int year;
	private Project project ;// Publicacao só pode ser associada a projeto EM ANDAMENTO -- OK! Implementada essa restrição
	private List<Collaborator> autores = new ArrayList<Collaborator>();
	
	
	public Publication(String title,String conference,int year,Collaborator autor ){
		this.title = title;
		this.conference = conference;
		this.year = year;
		autores.add(autor);
		autor.addPublication(this);
	}
	
	
	public void addAutores(Collaborator autor)
	{
		autores.add(autor);
		autor.addPublication(this);
	}
	
	public List<Collaborator> getAutores(){
		return autores;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project p) {		
		if(p.getStatus() == "EM ANDAMENTO"){
		this.project = p;
		p.addPublication(this);
		}else System.out.println("Projeto não está em andamento");
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getConference() {
		return conference;
	}

	public void setConference(String conference) {
		this.conference = conference;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}


}
