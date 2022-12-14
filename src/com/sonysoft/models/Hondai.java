package com.sonysoft.models;

public abstract class Hondai implements Demarrage {

	private int vitesse;
	private Moteur moteur;

	public Hondai() {
	}

	public Hondai(int vitesse, Moteur moteur) {
		super();
		this.vitesse = vitesse;
		this.moteur = moteur;
	}

	public int getVitesse() {
		return vitesse;
	}

	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}

	public Moteur getMoteur() {
		return moteur;
	}

	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}

	@Override
	public String toString() {
		return "Hondai [vitesse=" + vitesse + ", moteur=" + moteur + "]";
	}

}
