package br.edu.insper.mvc.model;

public class Pessoa {
	//private Integer id;
	private String nome;
	private Integer idade;
	
//	public Integer getID() {
//		return id;
//	}
	
	public String getName() {
		return nome;
	}
	
	public Integer getIdade() {
		return idade;
	}
	
//	public void setID(Integer id) {
//		this.id = id;
//		return;
//	}
	
	public void setNome(String nome) {
		this.nome = nome;
		return;
	}
	
	public void setIdade(Integer idade) {
		this.idade = idade;
		return;
	}
}