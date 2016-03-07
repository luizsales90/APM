package br.ufal.ic.p3;

import java.util.ArrayList;

import br.ufal.ic.p3.academicproduction.Orientation;
import br.ufal.ic.p3.academicproduction.Publication;
import br.ufal.ic.p3.collaborator.Collaborator;

public class ResearchLab {
	
	protected ArrayList<Project> projects = new ArrayList<Project>();
	protected ArrayList<Collaborator> collaborators = new ArrayList<Collaborator>();
	protected ArrayList<Publication> publications = new ArrayList<Publication>();
	protected ArrayList<Orientation> orientations = new ArrayList<Orientation>();	

	//	public ResearchLab(){
//		this.projects = new ArrayList<Project>();
//		this.publications = new ArrayList<Publication>();
//		this.orientations = new ArrayList<Orientation>();
//		this.collaborators = new ArrayList<Collaborator>();
//	}
	
	public void addProject(Project p){
		if(!(this.projects.contains(p))){
			projects.add(p);					
		}else
			System.out.println("Projeto j� pertencente ao Lab!");
		
	}
	
	public Project getProject(Project p){
		return p;
	}
	
	public ArrayList<Project> getProjects(){
		return projects;
	}
	
	public void addCollaborator(Collaborator c){
		if(!(this.collaborators.contains(c))){
			collaborators.add(c);					
		}else System.out.println("Colaborador j� pertencente ao Lab!");
	}
	
	public ArrayList<Collaborator> getCollaborators(){
		return collaborators;
	}
	
	public Collaborator getCollaborator(Collaborator c){
		return collaborators.get(collaborators.indexOf(c));
	}
	
	public void addParticipant(Collaborator c, Project p){
		if(this.collaborators.contains(c)){
			p.addParticipant(c);		
		}	
	}
	
	public void addPublication(Publication p){
		if(!(this.publications.contains(p))){
			publications.add(p);					
		}else System.out.println("Publica��o j� pertencente ao Lab!");		
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
		System.out.println("Numero de colaboradores: "+collaborators.size()+
						   "\nNumero de projetos em elaboracao: "+projects.size()+ // separar projetos em elabora��o
						   "\nNumero de projetos em andamento: "+projects.size()+ // separar projetos em andamento
						   "\nNumero de projetos concluidos: "+projects.size()+ // separar projetos concluidos
						   "\nNumero total de projetos: "+projects.size()+
						   "\nNumero de producaoo academica por tipo de producao: "+
						   "\n -Numero de Publicacoes: "+publications.size()+
						   "\n -Numero de Orientacoes: "+orientations.size()); 
	}  
//	
	

//	}
//		
//	public void consulta(){
//	}
	
}
