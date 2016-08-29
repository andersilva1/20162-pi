package br.com.unieuro.java;

public class Nota {
	private int idEstudante;
	private int idGrade;
	private int nota;
	
	public Nota(int idEstudante, int idGrade, int nota){
		super();
		this.idEstudante = idEstudante;
		this.idGrade = idGrade;
		this.nota = nota;
	}

	public int getIdEstudante() {
		return idEstudante;
	}

	public void setIdEstudante(int idEstudante) {
		this.idEstudante = idEstudante;
	}

	public int getIdGrade() {
		return idGrade;
	}

	public void setIdGrade(int idGrade) {
		this.idGrade = idGrade;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

}
