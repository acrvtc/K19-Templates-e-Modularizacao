package br.com.k19.modelo;

public class Instrutor {
	
	private String nome;
	private String dataDeNascimento;
	
	
	public String getNome() {
		System.out.println("Obtendo nome do instrutor");
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataDeNascimento() {
		System.out.println("Obtendo data de nascimento do instrutor");
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	

}
