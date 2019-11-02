/**
 * 
 */
package com.starWars.Star.Wars.Resistence.Social.Network.model;

import java.util.ArrayList;

/**
 * @author Paulo
 *
 */
public class Rebelde {

	private String nome;
	private int idade;
	private String genero;
	private Localizacao localizacao;
	private ArrayList<Item> recurso;
	private boolean traidor;
	private int reporteTraidor;

	public Rebelde() {
		this.traidor = false;
		this.reporteTraidor = 0;
		Item i = new Item();
		setRecurso(i.adicionarItens());

	}
	
	

	public Rebelde(String nome, int idade, String genero, Localizacao localizacao) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.localizacao = localizacao;
		this.traidor = false;
		this.reporteTraidor = 0;
		Item i = new Item();
		setRecurso(i.adicionarItens());
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Localizacao getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}

	public ArrayList<Item> getRecurso() {
		return recurso;
	}

	public void setRecurso(ArrayList<Item> recurso) {
		this.recurso = recurso;
	}

	public boolean isTraidor() {
		return traidor;
	}

	public void setTraidor(boolean traidor) {
		this.traidor = traidor;
	}

	public int getReporteTraidor() {
		return reporteTraidor;
	}

	public void setReporteTraidor(int reporteTraidor) {
		this.reporteTraidor = reporteTraidor;
	}

	@Override
	public String toString() {
		return "Nome = " + nome + "\nIdade = " + idade + "\nGenero = " + genero + "\nLocalizacao = " + localizacao
				+ "\nRecursos = " + recurso +  "\n" + reporteTraidor + " Reportaram que é um traidor";
	}
	
	

}
