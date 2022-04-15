package gestions_notes;

import java.util.ArrayList;
import java.util.List;

public class liste_Etudiants extends  ArrayList<Etudiant> { 
	public boolean add(Etudiant e) {
		if(this.indexOf(e)>=0) 
		{
			int i=indexOf(e); 
			super.set(i,e);
		    return false;	
		}
		return super.add(e);
		
	}
	public List<Etudiant> flitrer(Conditions c)
	{   liste_Etudiants l= new liste_Etudiants();
		for (Etudiant e: this)
		  { 
		   if (c.estVrai(e));
		       l.add(e);
		  }
		    return l;
		    
		 
	}
	
	
}
