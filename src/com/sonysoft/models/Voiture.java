package com.sonysoft.models;

public class Voiture extends Hondai {

	private String matricule;

	public Voiture() {
		super();
	}

	public Voiture(int vitesse, Moteur moteur, String matricule) {
		super(vitesse, moteur);
		this.matricule = matricule;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	@Override
	public void demarrer() {
		System.out.println("voiture demarre avec vitesse = " + super.getVitesse() + "\nDescription "+this.toString());
	}

	@Override
	public String toString() {
		return "Voiture [matricule=" + matricule + ", vitesse=" + getVitesse() + ", moteur=" + getMoteur()
				+ "]";
	}

}
