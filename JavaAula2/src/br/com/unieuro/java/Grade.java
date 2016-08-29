package br.com.unieuro.java;

public class Grade {
	private int idGrade;
	private int idDisciplina;
	private String semestre;
	private int ano;
	private String professor;
	
	public Grade(int idGrade, int idDisciplina, String semestre, int ano, String professor){
		super();
		this.idGrade = idGrade;
		this.idDisciplina = idDisciplina;
		this.semestre = semestre;
		this.ano = ano;
		this.professor = professor;
	}

	public int getIdGrade() {
		return idGrade;
	}

	public void setIdGrade(int idGrade) {
		this.idGrade = idGrade;
	}

	public int getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(int idDisciplina) {
		this.idDisciplina = idDisciplina;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

}
