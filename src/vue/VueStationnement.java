package vue;

import action.ControleurStationnement;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import modele.Stationnement;

public class VueStationnement extends Scene
{
	
	protected Label valeurNom;
	protected Label valeurNombrePlace;
	protected Label valeurVille;
	protected Label valeurNombreEtage;
	
	private ControleurStationnement controleur = null;
	
	
	public VueStationnement()
	{
		super(new GridPane(),600,600);		
		GridPane grilleStationnement = (GridPane) this.getRoot();
		
		valeurNom = new Label("");
		grilleStationnement.add(new Label("Nom : "), 0, 0);
		grilleStationnement.add(valeurNom, 1, 0);
		
		valeurNombrePlace = new Label("");
		grilleStationnement.add(new Label("Nombre de place : "), 0, 1);
		grilleStationnement.add(valeurNombrePlace, 1, 1);
		
		valeurVille = new Label("");
		grilleStationnement.add(new Label("Ville : "), 0, 2);
		grilleStationnement.add(valeurVille, 1, 2);
		
		valeurNombreEtage = new Label("");
		grilleStationnement.add(new Label("Nombre d'etage : "), 0, 3);
		grilleStationnement.add(valeurNombreEtage, 1, 3);				

	}
	
	public void afficherStationnement(Stationnement stationnement)
	{
		this.valeurNom.setText(stationnement.getNom());
		this.valeurNombrePlace.setText(stationnement.getNombrePlace());
		this.valeurVille.setText(stationnement.getVille());
		this.valeurNombreEtage.setText(stationnement.getNombreEtage());
	}
	
	public void setControleur(ControleurStationnement controleur)
	{
		this.controleur = controleur;
	}
	
	
	
	
	
}
