	package br.ufal.ic.p3;

import java.util.List;

import br.ufal.ic.p3.collaborator.*;

import br.ufal.ic.p3.academicproduction.*;

public class Main {

	public static void main(String[] args) {
		
	ResearchLab lab = new ResearchLab();
	Project projeto1 = new Project("Qualidade de Software1", "10/07/2014", "15/04/2015" ,"Petrobras",20000.0 ,"Ganhar milhoes" , "Melhorar qualidade do software");
	Project projeto2 = new Project("Qualidade de Software2", "10/07/2014", "15/04/2015" ,"Petrobras",20000.0 ,"Ganhar milhoes" , "Melhorar qualidade do software");
	Project projeto3 = new Project("Qualidade de Software3", "10/07/2014", "15/04/2015" ,"Petrobras",20000.0 ,"Ganhar milhoes" , "Melhorar qualidade do software");
	lab.addProject(projeto1);
	lab.addProject(projeto2);
	lab.addProject(projeto3);
	
    Student raphael = new GradStudent("Raphael", "RaphaEmo@msn.com.br");
 	Professor lage = new Professor("Lage", "lage@gmail.com");
 	Publication publi = new Publication("Artigo sobre Sistemas de Recomendacao", "SBIE", 2014);
 	
 	
 	lab.addCollaborator(lage, projeto1);
 	lab.addCollaborator(lage, projeto2);
 	lab.addCollaborator(lage, projeto3);
 	lab.addCollaborator(raphael, projeto1);
 	lab.addCollaborator(raphael, projeto2);
 	lab.addCollaborator(raphael, projeto3);
 	lab.addPublication(raphael, publi);
 	projeto1.setStatus("Em andamento");
 	publi.setProject(projeto1);
 	lab.addCollaborator(raphael, projeto1);
 	
	Consultation.consultation(raphael);
	Consultation.consultation(lage);
	Consultation.consultation(projeto1);
	Consultation.consultation(projeto2);
	Consultation.consultation(projeto3);
	Consultation.consultation(lab);
	
	
	}

}
