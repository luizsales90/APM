package br.ufal.ic.p3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.ufal.ic.p3.academicproduction.Publication;
import br.ufal.ic.p3.collaborator.*;

import br.ufal.ic.p3.academicproduction.*;

public class Project {
	
	private String title, beginDate, endDate , fundingAgency, objective, description;
	private double financedValue;
	private Status status;
						 
	private List<Collaborator> participants = new ArrayList<Collaborator>();
	private List<Publication> publications = new ArrayList<Publication>(); 
//	private List<Orientation> orientations = new ArrayList<Orientation>();	
	
	public Project(String title, String beginDate, String endDate, String fundingAgency, double financedValue, String objective, String description){
		this.setTitle(title);
		this.setBeginDate(beginDate);
		this.setEndDate(endDate);
		this.setFundingAgency(fundingAgency);
		this.setFinancedValue(financedValue);
		this.setObjective(objective);
		this.setDescription(description);
		status = Status.EM_ELABORACAO;
	}
	
	public Project(){
		status = Status.EM_ELABORACAO;
	}
		
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	public String getFundingAgency() {
		return fundingAgency;
	}

	public void setFundingAgency(String fundingAgency) {
		this.fundingAgency = fundingAgency;
	}

	public String getObjective() {
		return objective;
	}

	public void setObjective(String objective) {
		this.objective = objective;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getFinancedValue() {
		return financedValue;
	}

	public void setFinancedValue(double financedValue) {
		this.financedValue = financedValue;
	}
	
	public void setStatus(String s)
	{
		if(s == "Em andamento")
		{
			if (	(this.getFundingAgency() 	== null) 	||
					(this.getBeginDate() 		== null) 	||
					(this.getEndDate() 			== null)	||
					(this.getDescription() 		== null) 	||
					(this.getObjective() 		== null) 	||
					(this.getTitle() 			== null)	||
					(this.getFinancedValue()  	== 0.0)		||
					(this.getParticipants().size() == 0)
				){
				System.out.println("Projeto ainda em elabora��o, insira todos os dados.");
			}else if(checkGradStudent()){
				System.out.println("Projeto nao pode ir para 'EM ANDAMENTO' pois Aluno de gradua��o possui numero maximo de projetos EM ANDAMENTO");				
			} else status = Status.EM_ANDAMENTO;			
		}else if(s == "Conclu�do"){
			if(this.status == Status.EM_ANDAMENTO){
				if(this.getPublications().size() == 0){
					System.out.println("Projeto n�o pode ser conclu�do pois n�o h� publica��o.");					
				}else status = Status.CONCLUIDO;	
			}else if(this.status == Status.EM_ELABORACAO){
				System.out.println("Status n�o est� Em Andamento para ser setado como Conclu�do");
				}else System.out.println("Projeto j� est� conclu�do"); 
			
		}

		
		
//		if (status == "Em elabora��o")
//		{
//			this.status = this.status.EM_ELABORACAO;	
//		} else if (status == "Em andamento") {
//			this.status = this.status.EM_ANDAMENTO;
//		} else if (status == "Conclu�do") {
//			this.status = this.status.CONCLUIDO;
//		}		
	}
	
	public String getStatus()
	{
		return status.toString();
	}

	public boolean checkGradStudent(){		
		Iterator it = participants.iterator();
	      while(it.hasNext()) {
	         Object element = it.next();
	         if (element instanceof GradStudent)
	         {
	        	 if(((GradStudent) element).getnProjects()<2){
	        		 ((GradStudent) element).incNprojects();
	        		 return false;	        		 
	        	 }
	         }	         
	      }
	      return true;
		
	}
	
	public boolean checkProfessor()
	{
	      Iterator it = participants.iterator();
	      while(it.hasNext()) {
	         Object element = it.next();
	         if (element instanceof Professor)
	         {
	        	 return true;
	         }
	      }
	      return false;
	}
	
	public void addParticipant(Collaborator participant)
	{
		if(status == status.EM_ELABORACAO)
		{
			if (participant instanceof Professor)
			{
				participants.add(participant);
				participant.addProject(this);
				
			} else {
				if (checkProfessor())
				{
					participants.add(participant);
					participant.addProject(this);
				} else {
					System.out.println("Insira um Professor primeiro!");
				}
			}
		}else{
			System.out.println("Projeto n�o est� em elabora��o, nao foi possivel alocar mais participantes");
		}
	}

	public List<Collaborator> getParticipants() {
		return participants;
	}
	
public void addPublication(Publication publication){
		publications.add(publication);
	}
	
public List<Publication> getPublications() {
	return publications;
}

public String toString(){
	return title;
}

public void report(){
	System.out.println("Titulo: "+this.getTitle()+
			"\nData Inicio: "+this.getBeginDate()+
			"\nData Final: "+this.getEndDate()+
			"\nAgencia Financiadora: "+this.getFundingAgency()+
			"\nValor Financiado: "+this.getFinancedValue()+
			"\nObjetivo: "+this.getObjective()+
			"\nDescricao: "+this.getDescription()+
			"\nStatus: "+this.getStatus()+
			"\nColaboradores: "+this.getParticipants()+			
			"\nProducao Academica: "+this.getPublications()
			);
	
}

//private String title, beginDate, endDate , fundingAgency, objective, description;
//private double financedValue;
//private Status status;
//					 
//private List<Collaborator> participants = new ArrayList<Collaborator>();
//private List<Publication> publications = new ArrayList<Publication>();
	
}
