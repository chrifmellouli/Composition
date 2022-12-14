package com.sonysoft.models;

public class Main {

	public static void main(String[] args) {
		Moteur engineV5 = new Moteur(5000);
		Moteur engineV8 = new Moteur(8000);
		Hondai voiture = new Voiture(100, engineV5, "54TN250");
		Hondai bateau = new Bateau(20, engineV8, "Zambabwai");
		voiture.demarrer();
		bateau.demarrer();
	}

}
