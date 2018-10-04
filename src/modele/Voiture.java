package modele;

public class Voiture 
{

	protected String marque;
	protected String modele;
	protected String puissance;
	protected String couleur;
	protected int idVoiture;
	protected int idStationnement;
	
	
	
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
	
	public Voiture(String marque, String modele, String puissance, String couleur, int idStationnement) {
		super();
		this.marque = marque;
		this.modele = modele;
		this.puissance = puissance;
		this.couleur = couleur;
		this.idStationnement = idStationnement;
	}	
	public Voiture(String marque, String modele, String puissance, String couleur, int idStationnement, int idVoiture) {
		super();
		this.marque = marque;
		this.modele = modele;
		this.puissance = puissance;
		this.couleur = couleur;
		this.idStationnement = idStationnement;
		this.idVoiture = idVoiture;
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

	public int getIdVoiture() {
		return idVoiture;
	}

	public void setIdVoiture(int idVoiture) {
		this.idVoiture = idVoiture;
	}

	public int getIdStationnement() {
		return idStationnement;
	}

	public void setIdStationnement(int idStationnement) {
		this.idStationnement = idStationnement;
	}
	
	
	
}
