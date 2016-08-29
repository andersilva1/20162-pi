package br.com.unieuro.java;

public class Disciplina {
	private String nomeDisciplina;
	private int id;
	private String credito;
	private String departamento;
	
	public Disciplina(String nomeDisciplina, int id, String credito, String departamento){
		super();
		this.nomeDisciplina = nomeDisciplina;
		this.id = id;
		this.credito = credito;
		this.departamento = departamento;
		
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCredito() {
		return credito;
	}

	public void setCredito(String credito) {
		this.credito = credito;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
		
	

}
