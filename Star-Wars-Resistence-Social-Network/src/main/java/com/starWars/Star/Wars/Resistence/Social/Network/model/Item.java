package com.starWars.Star.Wars.Resistence.Social.Network.model;

import java.util.ArrayList;

public class Item {

	private String nome;
	private int valor;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public ArrayList<Item> adicionarItens(){
		
		Item itemArma = new Item();
		itemArma.setNome("Arma");
		itemArma.setValor(4);
		Item itemMunicao = new Item();
		itemMunicao.setNome("Munição");
		itemMunicao.setValor(3);
		Item itemAgua = new Item();
		itemAgua.setNome("Água");
		itemAgua.setValor(2);
		Item itemComida = new Item();
		itemComida.setNome("Comida");
		itemComida.setValor(1);
		
		ArrayList<Item> it = new ArrayList<Item>();		
		it.add(itemArma);
		it.add(itemMunicao);
		it.add(itemAgua);
		it.add(itemComida);
			
		return it;
		
	}

	@Override
	public String toString() {
		return  nome + "  =  " + valor + " pontos |";
	}
	
	

}
