package br.com.k19.modelo;

public class Produto {
	
	private String nome;
	private String descricao;
	private String caminhoDaFigura;
	private double preco;
	private int id;
	
	
	public Produto(String nome, String descricao, String caminhoDaFigura, double preco, int id){
		this.nome = nome;
		this.descricao = descricao;
		this.caminhoDaFigura = caminhoDaFigura;
		this.preco = preco;
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getCaminhoDaFigura() {
		return caminhoDaFigura;
	}


	public void setCaminhoDaFigura(String caminhoDaFigura) {
		this.caminhoDaFigura = caminhoDaFigura;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	
	
	
}
