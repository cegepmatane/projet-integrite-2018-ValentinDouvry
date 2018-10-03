package modele;

public class Voiture 
{

	protected String marque;
	protected String modele;
	protected String puissance;
	protected String couleur;
	
	
	
	public Voiture(String marque) {
		super();
		this.marque = marque;
	}
	
	public Voiture(String marque, String modele) {
		super();
		this.marque = marque;
		this.modele = modele;
	}
	
	public Voiture(String marque, String modele, String puissance) {
		super();
		this.marque = marque;
		this.modele = modele;
		this.puissance = puissance;
	}

	public Voiture(String marque, String modele, String puissance, String couleur) {
		super();
		this.marque = marque;
		this.modele = modele;
		this.puissance = puissance;
		this.couleur = couleur;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getPuissance() {
		return puissance;
	}

	public void setPuissance(String puissance) {
		this.puissance = puissance;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
}
