package com.sonysoft.models;

public class Bateau extends Hondai {

	private String pays;

	public Bateau() {
		super();
	}

	public Bateau(int vitesse, Moteur moteur, String pays) {
		super(vitesse, moteur);
		this.pays = pays;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	@Override
	public void demarrer() {
		System.out.println("Le bateau demarre avec vitesse = " + super.getVitesse() + "\nDescription "+this.toString());
	}

	@Override
	public String toString() {
		return "Bateau [pays=" + pays + ", vitesse=" + getVitesse() + ", moteur=" + getMoteur() + "]";
	}

}
