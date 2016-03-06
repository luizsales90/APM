package br.ufal.ic.p3;

public enum Status {
	EM_ELABORACAO, EM_ANDAMENTO, CONCLUIDO;
	
	public String toString() {
		switch(this) {
			case EM_ELABORACAO:
				return "Em elabora��o";
			case EM_ANDAMENTO:
				return "Em andamento";
			case CONCLUIDO:
				return "Conclu�do";	
			default:
				return null;
		}
	}
	
}
