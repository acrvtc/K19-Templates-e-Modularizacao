package br.com.k19.controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.k19.modelo.Produto;

@ManagedBean
public class ProdutosBean {

	private Produto produtoSelecionado;
	private int idDoProdutoSelecionado;
	private List<Produto> produtos = new ArrayList<Produto>();


	public ProdutosBean () {
		this.produtos.add(new Produto(
				"Camiseta branca",
				"Esta � uma camiseta b�sica na cor branca. Ela � feita de algod�o e " +
						"est� dispon�vel nos tamanhos P, M e G.",
				"/imagens/camiseta-branca.jpg", 29.90 , 1));

		this.produtos.add(new Produto(
				"Camiseta preta",
				"Esta � uma camiseta na cor preta, que est� dispon�vel " +
						"nos tamanhos P, M e G. Seu material � 100% algod�o.",
				"/imagens/camiseta-preta.jpg", 39.90 , 2));

		this.produtos.add(new Produto(
				"Cal�a jeans",
				"Cal�a jeans dispon�vel nos tamanhos 38 a 50.",
				"/imagens/calca-jeans.jpg", 95.99 , 3));

		this.produtos.add(new Produto(
				"Terno",
				"Terno de seda na cor cinza.",
				"/imagens/terno.jpg", 589.95 , 4));

		this.produtos.add(new Produto(
				"Gravata",
				"Gravata nas cores vermelha, azul e verde.",
				"/imagens/gravata.jpg", 19.90 , 5));
		
		this.produtoSelecionado = this.produtos.get (0);

	}


	public void carregaProduto () {
		for (Produto produto : produtos) {
			if (this.idDoProdutoSelecionado == produto.getId ()) {
				this.produtoSelecionado = produto;
				break;
			}
		}
	}


	public Produto getProdutoSelecionado() {
		return produtoSelecionado;
	}


	public void setProdutoSelecionado(Produto produtoSelecionado) {
		this.produtoSelecionado = produtoSelecionado;
	}


	public int getIdDoProdutoSelecionado() {
		return idDoProdutoSelecionado;
	}


	public void setIdDoProdutoSelecionado(int idDoProdutoSelecionado) {
		this.idDoProdutoSelecionado = idDoProdutoSelecionado;
	}


	public List<Produto> getProdutos() {
		return produtos;
	}


	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	
	
}
