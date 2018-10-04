package donnee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modele.Stationnement;

public class StationnementDAO implements StationnementSQL
	
{
	private Connection connection = null;
	//protected List<Stationnement> listeStationnementTest;
	
	public StationnementDAO()
	{
		this.connection = BaseDeDonnees.getInstance().getConnection();
	}
	
	public List<Stationnement> listerStationnements()
	{
		List<Stationnement> listeStationnements = new ArrayList<Stationnement>();
		Statement requeteListeStationnements;
		try 
		{
			requeteListeStationnements = connection.createStatement();
			ResultSet curseurlisteStationnements = requeteListeStationnements.executeQuery(SQL_LISTER_STATIONNEMENT);
			while(curseurlisteStationnements.next())
			{
				int id = curseurlisteStationnements.getInt("id_stationnement");
				String nom = curseurlisteStationnements.getString("nom");
				String nombrePlace = curseurlisteStationnements.getString("nombre_place");
				String nombreEtage = curseurlisteStationnements.getString("nombre_etage");
				String ville = curseurlisteStationnements.getString("ville");
				System.out.println("Stationnement " + nom + " possedant " + nombrePlace + " sur " + nombreEtage + " etages et situe a " + ville);
				Stationnement stationnement = new Stationnement(nom, nombrePlace, ville, nombreEtage);
				stationnement.setIdStationnement(id);
				listeStationnements.add(stationnement);
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		return listeStationnements;
	}
	
	public void ajouterStationnement(Stationnement stationnement)
	{
		System.out.println("StationnementDAO.ajouterSationnement()");
		
		try {
			PreparedStatement requeteAjouterStationnement = connection.prepareStatement(SQL_AJOUTER_STATIONNEMENT);
			requeteAjouterStationnement.setString(1, stationnement.getNom());
			requeteAjouterStationnement.setString(2, stationnement.getNombrePlace());
			requeteAjouterStationnement.setString(3, stationnement.getNombreEtage());
			requeteAjouterStationnement.setString(4, stationnement.getVille());
			
			System.out.println("SQL : " + SQL_AJOUTER_STATIONNEMENT);
			requeteAjouterStationnement.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void modifierStationnement(Stationnement stationnement)
	{
		System.out.println("StationnementDAO.modifierSationnement()");
		
		try {
			PreparedStatement requeteModifierStationnement = connection.prepareStatement(SQL_MODIFIER_STATIONNEMENT);
			requeteModifierStationnement.setString(1, stationnement.getNom());
			requeteModifierStationnement.setString(2, stationnement.getNombrePlace());
			requeteModifierStationnement.setString(3, stationnement.getNombreEtage());
			requeteModifierStationnement.setString(4, stationnement.getVille());
			requeteModifierStationnement.setInt(5, stationnement.getIdStationnement());
			
			System.out.println("SQL : " + SQL_MODIFIER_STATIONNEMENT);
			requeteModifierStationnement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Stationnement rapporterStationnement(int idStationnement)
	{
		PreparedStatement requeteStationnement;
		try {
			requeteStationnement = connection.prepareStatement(SQL_RAPPORTER_STATIONNEMENT);
			requeteStationnement.setInt(1, idStationnement);
			System.out.println(SQL_RAPPORTER_STATIONNEMENT);
			ResultSet curseurStationnement = requeteStationnement.executeQuery();
			curseurStationnement.next();
			int id = curseurStationnement.getInt("id_stationnement");
			String nom = curseurStationnement.getString("nom");
			String nombrePlace = curseurStationnement.getString("nombre_place");
			String nombreEtage = curseurStationnement.getString("nombre_etage");
			String ville = curseurStationnement.getString("ville");
			System.out.println("Stationnement " + nom + " situe a " + ville + " possedant " + nombrePlace + " places sur " + nombreEtage + " etages");
			Stationnement stationnement = new Stationnement(nom, nombrePlace, ville, nombreEtage);
			stationnement.setIdStationnement(id);
			return stationnement;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	/*public List<Stationnement> simulerListeStationnement()
	{
		this.listeStationnementTest = new ArrayList<Stationnement>();
		this.listeStationnementTest.add(new Stationnement("Parking de la neige", "150 places", "Paris", "3",0));
		this.listeStationnementTest.add(new Stationnement("Parking de la reine", "400 places", "Londre", "4",1));
		this.listeStationnementTest.add(new Stationnement("Parking de la courtoisie", "12 places", "Montreal", "1",2));
		this.listeStationnementTest.add(new Stationnement("Parking de Vincent", "900 places", "Strasbourg", "10",3));
		this.listeStationnementTest.add(new Stationnement("Parking de Roger", "189 places", "Valence", "2",4));
		
		return listeStationnementTest;
	}*/
}

	