package br.ufal.ic.p3.collaborator;

import java.util.ArrayList;
import java.util.List;
import br.ufal.ic.p3.academicproduction.*;

public class Professor extends Collaborator {
	
	private List<Orientation> orientations = new ArrayList<Orientation>();
	
	public Professor(String name, String email) {
		super(name, email);		
		// TODO Auto-generated constructor stub
	}

	public List<Orientation> getOrientations() {
		return orientations;
	}

	public void addOrientation(Orientation orientation){
		orientations.add(orientation);
	
	}
	
	public void report(){
		System.out.println("Nome: "+this.getName()+
				"\nEmail: "+this.getEmail()+
				"\nLista de projetos: "+this.getProjects()+
				"\nProducao Academica: "+this.getPublications()+this.getOrientations()
				);
	}

}
