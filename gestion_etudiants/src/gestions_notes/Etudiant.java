package gestions_notes;

import aiac.gi18.java.complexe.Complexe;

//first part
// declaration de variables;
public class Etudiant implements Comparable<Etudiant> {
	private int id;
	private String nom;
	private double note;

	public void setNote(double note) {
		this.note = note;
	}

	public double getNote() {
		return note;
	}

//creation de constructeur;
	Etudiant(int id, String nom) {
		this.id = id;
		this.nom = nom;
		this.note = 10;
	}

//redefinition de la methode to string;
	public String toString() {
		return (this.nom + ":" + this.note);
	}

// redefinition de la methode equals.
	@Override
	public boolean equals(Object obj) {
		if (! (obj instanceof Etudiant) ){
			return false;
		}
		else if (this.id == ((Etudiant)obj).id)
			return true;
		else
			return false;
	}

//implementation de l interface compare etudiant et cretion de la methode compare to;
	public int compareTo(Etudiant e) {
		if (this.note > e.note)
			return 1;
		else if (this.note == e.note)
			return 0;
		else
			return -1;
	}

}
