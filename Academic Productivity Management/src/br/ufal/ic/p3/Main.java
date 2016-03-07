	package br.ufal.ic.p3;

import java.util.List;

import br.ufal.ic.p3.collaborator.*;

import br.ufal.ic.p3.academicproduction.*;

public class Main {

	public static void main(String[] args) {
	
//	ResearchLab lab = new ResearchLab();
//	Project projeto = new Project("Qualidade de Software", "10/07/2014", "15/04/2015" ,"Petrobras",20000.0 ,"Ganhar milh�es" , "Melhorar qualidade do software");
//	Student raphael = new GradStudent("Raphael", "RaphaEmo@msn.com.br"); 
//	Collaborator arnon = new GradStudent("Arnon", "Arnon.Gremio@hotmail.com");
//	Professor lage = new Professor("Lage", "lage@gmail.com");
//	Orientation o = new Orientation(lage,raphael,projeto1);
//	Publication p = new Publication("Artigo A","SIBDATA",2015, arnon);
	
//	Project projeto2 = new Project(lab);
//	projeto2.setTitle("Projeto de Big data");
//	projeto2.addParticipant(raphael);
//	projeto2.addParticipant(arnon);
//	projeto2.addParticipant(lage);	
//	projeto2.addOrientation(o);
//	projeto2.addPublication(p);
//	lab.addOrientation(o);
//	lab.addCollaborator(lage);

	
//	lab.addProject(projeto1);
//	lab.addProject(projeto2);
		
//	System.out.println(projeto1.getStatus());
//	System.out.println(projeto2.getStatus());
//	lab.report();
	
	ResearchLab lab = new ResearchLab();
	Project projeto1 = new Project("Qualidade de Software1", "10/07/2014", "15/04/2015" ,"Petrobras",20000.0 ,"Ganhar milh�es" , "Melhorar qualidade do software");
	Project projeto2 = new Project("Qualidade de Software2", "10/07/2014", "15/04/2015" ,"Petrobras",20000.0 ,"Ganhar milh�es" , "Melhorar qualidade do software");
	Project projeto3 = new Project("Qualidade de Software2", "10/07/2014", "15/04/2015" ,"Petrobras",20000.0 ,"Ganhar milh�es" , "Melhorar qualidade do software");
	lab.addProject(projeto1);
	lab.addProject(projeto2);
	lab.addProject(projeto3);
	
    Student raphael = new GradStudent("Raphael", "RaphaEmo@msn.com.br");
 	Professor lage = new Professor("Lage", "lage@gmail.com");
 	
	lab.getProject(projeto1).addParticipant(lage);
	lab.getProject(projeto2).addParticipant(lage);
	lab.getProject(projeto3).addParticipant(lage);
	lab.getProject(projeto1).addParticipant(raphael);
	lab.getProject(projeto2).addParticipant(raphael);
	lab.getProject(projeto3).addParticipant(raphael);
	
	}

}
