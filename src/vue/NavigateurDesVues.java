package vue;

import action.ControleurStationnement;
import javafx.application.Application;
import javafx.stage.Stage;

public class NavigateurDesVues extends Application
{

	private Stage stade;
	
	private VueStationnement vueStationnement = null;
	private VueListeStationnement vueListeStationnement = null;
	private VueAjouterStationnement vueAjouterStationnement = null;
	private VueEditerStationnement vueEditerStationnement = null;
	private VueAjouterVoiture vueAjouterVoiture = null;
	private VueEditerVoiture vueEditerVoiture = null;
	
	private ControleurStationnement controleur = null;
	
	public NavigateurDesVues() 
	{
		this.vueStationnement = new VueStationnement();
		this.vueListeStationnement = new VueListeStationnement();
		this.vueAjouterStationnement = new VueAjouterStationnement();
		this.vueEditerStationnement = new VueEditerStationnement();
		this.vueAjouterVoiture = new VueAjouterVoiture();
		this.vueEditerVoiture = new VueEditerVoiture();
	}
	
	@Override
	public void start(Stage stade) throws Exception 
	{
		this.stade = stade;
		this.stade.setScene(null);
		
		this.controleur = ControleurStationnement.getInstance();
		this.controleur.activerVues(this);
		this.vueStationnement.setControleur(controleur);
		this.vueListeStationnement.setControleur(controleur);
		this.vueAjouterStationnement.setControleur(controleur);
		this.vueEditerStationnement.setControleur(controleur);
		this.vueAjouterVoiture.setControleur(controleur);
		this.vueEditerVoiture.setControleur(controleur);
	}

	public VueStationnement getVueStationnement() {
		return this.vueStationnement;
	}

	public VueListeStationnement getVueListeStationnement() {
		return this.vueListeStationnement;
	}

	public VueAjouterStationnement getVueAjouterStationnement() {
		return this.vueAjouterStationnement;
	}

	public VueEditerStationnement getVueEditerStationnement() {
		return this.vueEditerStationnement;
	}	
	
	public VueAjouterVoiture getVueAjouterVoiture() {
		return this.vueAjouterVoiture;
	}
	
	public VueEditerVoiture getVueEditerVoiture() {
		return this.vueEditerVoiture;
	}

	public void naviguerVersVueStationnement()
	{
		stade.setScene(this.vueStationnement);
		stade.show();
	}
	
	public void naviguerVersVueListeStationnement()
	{
		stade.setScene(this.vueListeStationnement);
		stade.show();
	}
	
	public void naviguerVersVueAjouterStationnement()
	{
		stade.setScene(this.vueAjouterStationnement);
		stade.show();
	}
	
	public void naviguerVersVueEditerStationnement()
	{
		stade.setScene(this.vueEditerStationnement);
		stade.show();
	}
	
	public void naviguerVersVueAjouterVoiture()
	{
		stade.setScene(this.vueAjouterVoiture);
		stade.show();
	}
	
	public void naviguerVersVueEditerVoiture()
	{
		stade.setScene(this.vueEditerVoiture);
		stade.show();
	}
	
	
}
