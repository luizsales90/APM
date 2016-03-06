package br.ufal.ic.p3;

import java.util.ArrayList;
import java.util.List;

import br.ufal.ic.p3.academicproduction.Publication;
import br.ufal.ic.p3.collaborator.*;

import br.ufal.ic.p3.academicproduction.*;

public class Project {
	
	private String title, beginDate, endDate , fundingAgency, objective, description;
	private double financedValue;
//	private ResearchLab lab;	
//	private int id;
	private Status status;// Só pode ser EM ANDAMENTO se tiver um professor participant.
						  //Só pode ser CONCLUÍDO se tiver publicação
	private List<Collaborator> participants = new ArrayList<Collaborator>();
	private List<Publication> publications = new ArrayList<Publication>(); // eh de publicações msm ou teria que ser de produções 
																		   //acadêmicas pra incluir tb as orienteações?
																		   //Nao tem nada especificado sobre orientações relacionadas
																		   //a projetos
	private List<Orientation> orientations = new ArrayList<Orientation>();
	
	
	public Project(String title, String beginDate, String endDate, String fundingAgency, double financedValue, String objective, String description,ResearchLab lab){
//		this.setId();
		this.setTitle(title);
		this.setBeginDate(beginDate);
		this.setEndDate(endDate);
		this.setFundingAgency(fundingAgency);
		this.setFinancedValue(financedValue);
		this.setObjective(objective);
		this.setDescription(description);
//		this.setLab(lab);
		
		status = Status.EM_ELABORACAO;
	}
	
	public Project(ResearchLab lab){
//		this.setId();
//		this.setLab(lab);
		status = Status.EM_ELABORACAO;
	}
		
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
		setStatus();
	}
	
	public String getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
		setStatus();
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
		setStatus();
	}
	
	public String getFundingAgency() {
		return fundingAgency;
	}

	public void setFundingAgency(String fundingAgency) {
		this.fundingAgency = fundingAgency;
		setStatus();
	}

	public String getObjective() {
		return objective;
	}

	public void setObjective(String objective) {
		this.objective = objective;
		setStatus();
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
		setStatus();
	}

	public double getFinancedValue() {
		return financedValue;
	}

	public void setFinancedValue(double financedValue) {
		this.financedValue = financedValue;
		setStatus();
	}
	
//	public ResearchLab getLab() {
//		return lab;
//	}
//	
//	public void setLab(ResearchLab lab) {
//		this.lab = lab;
//		if(!lab.projects.contains(this)){
//			lab.addProject(this);
//		}
//		setStatus();
//	}
	
	public void setStatus()
	{
		if ((this.getFundingAgency() 	== null) 	&& // Mudar esses &&s pra ||s resolve esse if?
			(this.getBeginDate() 		== null) 	&&
			(this.getEndDate() 		== null)		&&
			(this.getDescription() 		== null) 	&&
			(this.getObjective() 		== null) 	&&
			(this.getTitle() 			== null)	&&
			(this.getFinancedValue()  == 0.0))
		{
			status = Status.EM_ELABORACAO;
		}
		else
		{
			status = Status.EM_ANDAMENTO;
		}		
	}
	
	public void setStatus(String status)
	{
		
		if(status.toString() == "Em andamento")
		{
			
		}else if(status.toString() == "Concluído"){
			
		}
		
		
//		if (status == "Em elaboração")
//		{
//			this.status = this.status.EM_ELABORACAO;	
//		} else if (status == "Em andamento") {
//			this.status = this.status.EM_ANDAMENTO;
//		} else if (status == "Concluído") {
//			this.status = this.status.CONCLUIDO;
//		}		
	}
	
	public String getStatus()
	{
		return status.toString();
	}
	
	public void addParticipant(Collaborator participant){		
		if(this.getStatus() == "Em elaboração" ){
			if(participant instanceof GradStudent){
				if(participant.numberOfProjects < 2){
				participants.add(participant);
				participant.numberOfProjects++;
//				participant.addProjects(this);
				}else System.out.println("Estudante já possui número máximo de projetos!");
			}else
				participants.add(participant);
				participant.numberOfProjects++;
//				participant.addProjects(this);		
		}else System.out.println("Projeto não está em elaboração, proibido alocar mais participantes");
	}

	public List<Collaborator> getParticipants() {
		return participants;
	}
	
//	public int getId() {
//		return id;
//	}
//	
//	public void setId(/*int id*/) {
//		
//		this.id = IdGenerator.getNextId();
//	//	setStatus();
//	//	this.id = id;
//	}	
	
public void addPublication(Publication publication){
		publications.add(publication);
		publication.setProject(this);
//		if(!this.getLab().publications.contains(publication)){ // Aqui nao testei, mas deve tá dando erro na hora de compilar tb!Pq?
//			lab.addPublication(publication);					
//		}
	}
	
public List<Publication> getPublications() {
	return publications;
}

public void addOrientation(Orientation orientation){
	orientations.add(orientation);
//	if(!this.getLab().orientations.contains(orientation)){ // Aqui tá dando erro na hora de compilar!Pq?
//		lab.addOrientation(orientation);					
//	}
}

public List<Orientation> getOrientations() {
	return orientations;
}

	
}
