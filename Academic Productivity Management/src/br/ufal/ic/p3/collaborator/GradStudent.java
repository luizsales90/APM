package br.ufal.ic.p3.collaborator;

public class GradStudent extends Student {
	
	private int nProjects;

	public GradStudent(String name, String email) {
		super(name, email);
		nProjects = 0;
		// TODO Auto-generated constructor stub
	}

	public int getnProjects() {
		return nProjects;
	}

	public void incNprojects() {
		nProjects++;
	}

	
	
//	private String regimeCurso;
//	
//
//	public String getRegimeCurso() {
//		return regimeCurso;
//	}
//
//	public void setRegimeCurso(String regimeCurso) {
//		this.regimeCurso = regimeCurso;
//	}

}
