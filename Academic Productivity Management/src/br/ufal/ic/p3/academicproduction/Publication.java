package br.ufal.ic.p3.academicproduction;
import br.ufal.ic.p3.Project;

import java.util.ArrayList;
import java.util.List;
import br.ufal.ic.p3.collaborator.*;

public class Publication {
	
	private String title, conference;
	private int year;
	private Project project ;
	private List<Collaborator> authors = new ArrayList<Collaborator>();
	
	
	public Publication(String title,String conference,int year){
		this.title = title;
		this.conference = conference;
		this.year = year;
	}
	
	public String toString(){
		return title;
	}
	
	public void addAuthors(Collaborator author)
	{
		authors.add(author);
		author.addPublication(this);
		
	}
	
	public List<Collaborator> getAuthors(){
		return authors;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project p) {		
		if(p.getStatus() == "Em andamento"){
		this.project = p;
		p.addPublication(this);
		}else System.out.println("Publicacao nao pode ser associada ao projeto pois este nao esta em andamento.");
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
