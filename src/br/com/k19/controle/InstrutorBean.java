package br.com.k19.controle;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import br.com.k19.modelo.Instrutor;

@ManagedBean
public class InstrutorBean {

	private List<Instrutor> instrutores = new ArrayList<Instrutor>();
	
	@PostConstruct
	public void init() {
		System.out.println("Novo managed bean create " + InstrutorBean.class);
	}
	
	public InstrutorBean(){
		
		Instrutor rafael = new Instrutor();
		rafael.setNome("Rafael Consentino");
		rafael.setDataDeNascimento("30/10/1984");
		
		Instrutor marcelo = new Instrutor();
		marcelo.setNome("Marcelo Martins");
		marcelo.setDataDeNascimento("02/04/1985");
		
		this.instrutores.add(rafael);
		this.instrutores.add(marcelo);
		
	}

	public List<Instrutor> getInstrutores() {
		return instrutores;
	}

	public void setInstrutores(List<Instrutor> instrutores) {
		this.instrutores = instrutores;
	}


}



