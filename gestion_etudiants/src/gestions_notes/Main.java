package gestions_notes;

public class Main {

	
	
	public static void main(String[] args) {
		Etudiant e1 = new Etudiant(1,"hamid");
	Etudiant e2 = new Etudiant(2,"driss");
	Etudiant e3 = new Etudiant(1,"youssef");
	e1.setNote(15);
	e2.setNote(12);
	e3.setNote(16);
	
	
	liste_Etudiants mes_Etudiants= new liste_Etudiants();
	mes_Etudiants.add(e1);
	mes_Etudiants.add(e2);
	mes_Etudiants.add(e3);
	System.out.println(mes_Etudiants);
	
	
	
	}
	

}
