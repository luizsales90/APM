package br.ufal.ic.p3;

import br.ufal.ic.p3.collaborator.Collaborator;

public class Consultation {
	
	public static void consultation(Collaborator c){
		c.report();
	}
	
	public static void consultation(Project p){
		p.report();
	}
	
	public static void consultation(ResearchLab l){
		l.report();
	}
	
	

}
