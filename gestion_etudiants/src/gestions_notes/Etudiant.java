package gestions_notes;
// declaration de variables;
public class Etudiant implements Comparable <Etudiant> {
private int id ;
private String nom;
private double note ;
//creation de constructeur;
Etudiant (int id , String nom)
{this.id=id;
 this.nom=nom;
 this.note= 10;
}
//redefinition de la methode to string;
public String toString 
{
	return (this.nom + ":"+this.note);
}
// redefinition de la methode equals.
public boolean equals(Etudiant etd)
{ if (this.id==etd.id)
	    return true;
else return false;
}
//implementation de l interface compare etudiant et cretion de la methode compare to;
public int compareTo(Etudiant e) {
	if(this.note > e.note )
		return 1;
	else if (this.note==e.note)
	    return 0;
	else 
	return -1;
}





}
