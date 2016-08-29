package br.com.unieuro.java;

public class Prerequisito {
	private int idDisciplina;
	private int idPrerequisito;
	
	public Prerequisito(int idDisciplina, int idPrerequisito){
		super();
		this.idDisciplina = idDisciplina;
		this.idPrerequisito = idPrerequisito;
	}

	public int getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(int idDisciplina) {
		this.idDisciplina = idDisciplina;
	}

	public int getIdPrerequisito() {
		return idPrerequisito;
	}

	public void setIdPrerequisito(int idPrerequisito) {
		this.idPrerequisito = idPrerequisito;
	}

}
