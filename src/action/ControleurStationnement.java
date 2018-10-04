package action;

import donnee.StationnementDAO;
import modele.Stationnement;
import vue.NavigateurDesVues;
import vue.VueAjouterStationnement;
import vue.VueEditerStationnement;
import vue.VueListeStationnement;
import vue.VueStationnement;

public class ControleurStationnement 
{
	//Stationnement
	private VueListeStationnement vueListeStationnement = null;
	private VueAjouterStationnement vueAjouterStationnement = null;
	private VueEditerStationnement vueEditerStationnement = null;
	private VueStationnement vueStationnement = null;
	//DAO
	private StationnementDAO stationnementDAO = null;
	//Voiture
	private NavigateurDesVues navigateur;
	
	
 	
	private ControleurStationnement()
	{
		System.out.println("Initialisation du controleur");
		this.stationnementDAO = new StationnementDAO();
	}
	
	private static ControleurStationnement instance = null;
	public static ControleurStationnement getInstance()
	{
		if (null == instance) 
		{			
			instance = new ControleurStationnement();
		}
		return instance;
	}
	
	public void activerVues(NavigateurDesVues navigateur)
	{
		this.navigateur = navigateur;
		this.vueStationnement = navigateur.getVueStationnement();
		this.vueListeStationnement = navigateur.getVueListeStationnement();
		this.vueAjouterStationnement = navigateur.getVueAjouterStationnement();
		this.vueEditerStationnement = navigateur.getVueEditerStationnement();
		
		//Stationnement stationnement = new Stationnement("Parking de la neige", "150 places", "Paris", "3");
		
		//this.vueStationnement.afficherStationnement(stationnement);
		//this.navigateur.naviguerVersVueStationnement();
		
		this.vueListeStationnement.afficherListeStationnement(stationnementDAO.listerStationnements());
		this.navigateur.naviguerVersVueListeStationnement();
	}
	
	public void notifierEnregistrerNouveauStationnement()
	{
		System.out.println("ControleurStationnement.notifierEnregistrerNouveauStationnement()");
		Stationnement stationnement = this.navigateur.getVueAjouterStationnement().demanderStationnement();
		this.stationnementDAO.ajouterStationnement(stationnement);
		this.vueListeStationnement.afficherListeStationnement(this.stationnementDAO.listerStationnements());
		this.navigateur.naviguerVersVueListeStationnement();
	}
	
	public void notifierEnregistrerStationnement()
	{
		System.out.println("ControleurStationnement.notifierEnregistrerStationnement()");
		Stationnement stationnement = this.navigateur.getVueEditerStationnement().demanderStationnement();
		this.stationnementDAO.modifierStationnement(stationnement);
		this.vueListeStationnement.afficherListeStationnement(this.stationnementDAO.listerStationnements());
		this.navigateur.naviguerVersVueListeStationnement();		
	}
	
	public void notifierNaviguerAjouterStationnement()
	{
		System.out.println("ControleurStationnement.notifierNaviguerAjouterStationnement()");
		this.navigateur.naviguerVersVueAjouterStationnement();
	}
	
	public void notifierNaviguerEditerStationnement(int idStationnement)
	{
		System.out.println("ControleurStationnement.notifierEditerStationnement("+idStationnement+")");
		this.vueEditerStationnement.afficherStationnement(this.stationnementDAO.rapporterStationnement(idStationnement));
		this.navigateur.naviguerVersVueEditerStationnement();
		
	}

}
