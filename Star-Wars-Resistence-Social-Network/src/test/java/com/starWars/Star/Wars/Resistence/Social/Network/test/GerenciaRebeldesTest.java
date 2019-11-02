package com.starWars.Star.Wars.Resistence.Social.Network.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.starWars.Star.Wars.Resistence.Social.Network.GerenciaRebeldes;
import com.starWars.Star.Wars.Resistence.Social.Network.model.Localizacao;
import com.starWars.Star.Wars.Resistence.Social.Network.model.Rebelde;

class GerenciaRebeldesTest {

	GerenciaRebeldes gr;
	Rebelde r;
	Localizacao l;
	
	@BeforeEach
	void setUp() throws Exception {
		gr = new GerenciaRebeldes();
		r = new Rebelde();
		l = new Localizacao();
		l.setLatitude("23");
		l.setLongitude("232");
		l.setNome("Test");
		
	}
 	
	@Test
	void testVerificarTraidor() {
		assertEquals(false, gr.verificarTraidor(r));
	}


}
