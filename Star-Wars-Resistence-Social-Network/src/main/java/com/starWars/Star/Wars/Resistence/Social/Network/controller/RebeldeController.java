/**
 * 
 */
package com.starWars.Star.Wars.Resistence.Social.Network.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.starWars.Star.Wars.Resistence.Social.Network.GerenciaRebeldes;
import com.starWars.Star.Wars.Resistence.Social.Network.model.Localizacao;
import com.starWars.Star.Wars.Resistence.Social.Network.model.Rebelde;

/**
 * @author Paulo
 *
 */
@RestController
public class RebeldeController {
	
	Rebelde r = new Rebelde();
	
	@RequestMapping("/")
	String saudar() {
		
		return "Olá Rebelde";
		
	}
	
	@RequestMapping("/Loc/atual")
	Rebelde alterarLocRebelde() {

		Rebelde r = new Rebelde();
		Localizacao l = new Localizacao();
		
		GerenciaRebeldes gr = new GerenciaRebeldes();
		gr.atualizarLocalizacao(r, l);
		return r;

	}
	
	@RequestMapping("/rebeldes")
	public List<Rebelde> listarRebeldes() {
		return Arrays.asList(
				new Rebelde("Paulo", 30, "Masculino", new Localizacao("236273G", "8798372T", "Base São Paulo")),
				new Rebelde("Sergio", 40, "Masculino", new Localizacao("2373G", "8792T", "Base Joao Pessoa")),
				new Rebelde("Junior", 35, "Masculino", new Localizacao("236G", "8372T", "Base Cabedelo"))
				);
	}
}
