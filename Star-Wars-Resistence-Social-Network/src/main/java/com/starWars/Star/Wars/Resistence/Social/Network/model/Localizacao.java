/**
 * 
 */
package com.starWars.Star.Wars.Resistence.Social.Network.model;

/**
 * @author Paulo
 *
 */
public class Localizacao {

	private String latitude;
	private String longitude;
	private String nome;
	
	

	public Localizacao() {
	}

	public Localizacao(String latitude, String longitude, String nome) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.nome = nome;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Latitude= " + latitude + " | Longitude= " + longitude + " | Nome da Base= " + nome ;
	}

	
}
