package br.ufal.ic.p3.collaborator;

import java.util.ArrayList;
import java.util.List;
import br.ufal.ic.p3.academicproduction.*;

public class Professor extends Collaborator {
	
	public Professor(String name, String email) {
		super(name, email);		
		// TODO Auto-generated constructor stub
	}

	private List<Orientation> orientations = new ArrayList<Orientation>();
	
//	public Professor(String name, String email){
//		this.name = name;
//		this.email = email;		
//	}

	public List<Orientation> getOrientations() {
		return orientations;
	}

	public void addOrientation(Orientation orientation){
		orientations.add(orientation);
	
	}

}
