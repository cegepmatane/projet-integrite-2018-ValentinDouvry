package modele;

public class Stationnement 
{
	protected String nom;
	protected String nombrePlace;
	protected String ville;
	protected String nombreEtage;
	
	
	public Stationnement(String nom)
	{
		super();
		this.nom = nom;
	}
	
	public Stationnement(String nom, String nombrePlace)
	{
		super();
		this.nom = nom;
		this.nombrePlace = nombrePlace;
	}
	
	public Stationnement(String nom, String nombrePlace, String ville)
	{
		this.nom= nom;
		this.nombrePlace = nombrePlace;
		this.ville = ville;
	}
	
	public Stationnement(String nom, String nombrePlace, String ville, String nombreEtage)
	{
		this.nom = nom;
		this.nombrePlace = nombrePlace;
		this.ville = ville;
		this.nombreEtage = nombreEtage;
	}
	
	
	
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getNombrePlace() {
		return nombrePlace;
	}
	
	public void setNombrePlace(String nombrePlace) {
		this.nombrePlace = nombrePlace;
	}
	
	public String getVille() {
		return ville;
	}
	
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	public String getNombreEtage() {
		return nombreEtage;
	}
	
	public void setNombreEtage(String nombreEtage) {
		this.nombreEtage = nombreEtage;
	}
	
	
	
	
}
