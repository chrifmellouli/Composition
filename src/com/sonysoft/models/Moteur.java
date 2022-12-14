package com.sonysoft.models;

public class Moteur {

	private int puissance;

	public Moteur() {
	}

	public Moteur(int puissance) {
		this.puissance = puissance;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	@Override
	public String toString() {
		return "Moteur [puissance=" + puissance + "]";
	}

}
