package br.ufal.ic.p3;

import java.util.ArrayList;
import java.util.Iterator;

import br.ufal.ic.p3.academicproduction.Orientation;
import br.ufal.ic.p3.academicproduction.Publication;
import br.ufal.ic.p3.collaborator.Collaborator;
import br.ufal.ic.p3.collaborator.GradStudent;

public class ResearchLab {
	
	protected ArrayList<Project> projects = new ArrayList<Project>();
	protected ArrayList<Collaborator> collaborators = new ArrayList<Collaborator>();
	protected ArrayList<Publication> publications = new ArrayList<Publication>();
	protected ArrayList<Orientation> orientations = new ArrayList<Orientation>();	
	
	private int elabProjs=0;
	private int andamentProjs=0;
	private int conclProjs=0;
	
	public void addProject(Project p){
		if(!(this.projects.contains(p))){
			projects.add(p);					
		}else
			System.out.println("Projeto j� pertencente ao Lab!");
		
	}
	
	public Project getProject(Project p){
		return projects.get(projects.indexOf(p));
	}
	
	public ArrayList<Project> getProjects(){
		return projects;
	}

	public void countProjectsByStatus(){
		Iterator it = projects.iterator();
	      while(it.hasNext()) {
	         Object element = it.next();
	         if ( ((Project) element).getStatus() == Status.EM_ELABORACAO.toString() ){
	        	 elabProjs++;
	         }else if(((Project) element).getStatus() == Status.EM_ANDAMENTO.toString() ){
	        	 andamentProjs++;
	         }else if(((Project) element).getStatus() == Status.CONCLUIDO.toString()){
	        	 conclProjs++;
	         }	         
	      }		
	}
	
	public void addCollaborator(Collaborator c, Project p){
	    if(this.collaborators.contains(c)){
	      p.addParticipant(c);  
	    } else {
	      collaborators.add(c);
	      p.addParticipant(c);
	    }
	  }
	
	public Collaborator getCollaborator(Collaborator c){
		return collaborators.get(collaborators.indexOf(c));
	}
	
	public ArrayList<Collaborator> getCollaborators(){
		return collaborators;
	}
	
	public void addPublication(Collaborator c,Publication publi){
		if(this.collaborators.contains(c)){
			publi.addAuthors(c);
			publications.add(publi);
		}else {
			collaborators.add(c);
			publi.addAuthors(c);
			publications.add(publi);
		}		
	}
	
	public ArrayList<Publication> getPublications() {
		return publications;
	}

	public void addOrientation(Orientation o){
		if(!(this.orientations.contains(o))){
			orientations.add(o);					
		}else System.out.println("Orienta��o j� pertencente ao Lab!");
	}
	
	public ArrayList<Orientation> getOrientations(){
		return orientations;
	}
	
	protected void report(){
		this.countProjectsByStatus();
		System.out.println("Numero de colaboradores: "+collaborators.size()+
						   "\nNumero de projetos em elaboracao: "+elabProjs+ 
						   "\nNumero de projetos em andamento: "+andamentProjs+ 
						   "\nNumero de projetos concluidos: "+conclProjs+ 
						   "\nNumero total de projetos: "+projects.size()+
						   "\nNumero de producoes academicas por tipo de producao: "+
						   "\n -Numero de Publicacoes: "+publications.size()+
						   "\n -Numero de Orientacoes: "+orientations.size()); 
	}  
	
}
