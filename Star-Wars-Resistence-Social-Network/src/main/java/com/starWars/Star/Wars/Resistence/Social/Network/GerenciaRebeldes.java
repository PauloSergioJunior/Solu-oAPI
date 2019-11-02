package com.starWars.Star.Wars.Resistence.Social.Network;

import java.util.ArrayList;

import com.starWars.Star.Wars.Resistence.Social.Network.model.Item;
import com.starWars.Star.Wars.Resistence.Social.Network.model.Localizacao;
import com.starWars.Star.Wars.Resistence.Social.Network.model.Rebelde;

public class GerenciaRebeldes {

	/**
	 * Método que recebe por parâmetro um objeto (Rebelde) e e um objeto (Localizacao) que faz uma ateração
	 * da localidade do rebelde para uma localidade atual reportada 
	 * @param reb
	 * @param locAtual
	 */
	public void atualizarLocalizacao(Rebelde reb, Localizacao locAtual) {

		reb.setLocalizacao(locAtual);

	}

	/**
	 * Método que recebe por parâmetro um objeto (Rebelde) que reporta que aquele rebelde é um traidor 
	 * @param reb
	 */
	public void trair(Rebelde reb) {

		reb.setReporteTraidor((reb.getReporteTraidor() + 1));

		if (reb.getReporteTraidor() >= 3) {
			reb.setTraidor(true);
		}
	}

	/**
	 * Método que recebe por parâmetro um objeto (Rebelde) que é chamado toda vez que o metodo trir() é executado
	 * e verifica se aquele rebelde é um traidor e retorna um boolean para confirmação 
	 * @param reb
	 * @return
	 */
	public boolean verificarTraidor(Rebelde reb) {

		if (reb.isTraidor()) {
			return true;
		}
		return false;

	}

	/**
	 * Método que recebe por parâmetro dois objetos (Rebelde) e duas lista do tipo Item
	 * Executa a negociação de recursos
	 * Os condicionais é para verificação se os valores(ontos) são iguais para que a negociaçao seja efetuada 
	 * @param rebelde1
	 * @param rebelde2
	 * @param listItemRebelde1
	 * @param listItemRebelde2
	 */
	public void negociarRecursos(Rebelde rebelde1, Rebelde rebelde2, ArrayList<Item> listItemRebelde1,
			ArrayList<Item> listItemRebelde2) {

		int pontosRebelde1 = 0;
		int pontosRebelde2 = 0;
		if (!rebelde1.isTraidor() && !rebelde2.isTraidor()) {

			for (Item i : listItemRebelde1) {
				pontosRebelde1 += i.getValor();
			}

			for (Item i : listItemRebelde2) {
				pontosRebelde2 += i.getValor();
			}

			if (pontosRebelde1 == pontosRebelde2) {

				for (Item i : listItemRebelde1) {

					rebelde1.getRecurso().remove(i);
					rebelde2.getRecurso().add(i);
				}

				for (Item i : listItemRebelde2) {

					rebelde2.getRecurso().remove(i);
					rebelde1.getRecurso().add(i);

				}

			} else {

				System.out.println("Total de pontos incopatíveis");

			}
		} else {
			System.out.println("Não é possivel negociar com traidor");
		}

	}

}
