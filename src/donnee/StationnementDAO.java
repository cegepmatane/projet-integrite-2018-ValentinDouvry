package donnee;

import java.util.ArrayList;
import java.util.List;

import modele.Stationnement;

public class StationnementDAO 
	
{
	protected List<Stationnement> listeStationnementTest;
	
	public List<Stationnement> listerStationnement()
	{
		return this.simulerListeStationnement();
	}
	
	public List<Stationnement> simulerListeStationnement()
	{
		this.listeStationnementTest = new ArrayList<Stationnement>();
		this.listeStationnementTest.add(new Stationnement("Parking de la neige", "150 places", "Paris", "3",0));
		this.listeStationnementTest.add(new Stationnement("Parking de la reine", "400 places", "Londre", "4",1));
		this.listeStationnementTest.add(new Stationnement("Parking de la courtoisie", "12 places", "Montreal", "1",2));
		this.listeStationnementTest.add(new Stationnement("Parking de Vincent", "900 places", "Strasbourg", "10",3));
		this.listeStationnementTest.add(new Stationnement("Parking de Roger", "189 places", "Valence", "2",4));
		
		return listeStationnementTest;
	}
	
	public void ajouterStationnement(Stationnement stationnement)
	{
		System.out.println("StationnementDAO.ajouterSationnement()");
		
	}
	
	public void modifierStationnement(Stationnement stationnement)
	{
		System.out.println("StationnementDAO.modifierSationnement()");
	}
	
	public Stationnement rapporterStationnement(int idStationnement)
	{
		Stationnement stationnement = new Stationnement("", "", "", "", 0);
		System.out.println("StationnementDAO.rapporterSationnement()");
		for (Stationnement stationnementTeste : listeStationnementTest) {
			if(stationnementTeste.getIdStationnement() == idStationnement)
			{
				stationnement = stationnementTeste;
			}
			
		}
		return stationnement;
	}
}

	