package vue;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import modele.Stationnement;

public class VueStationnement extends Application
{

	/*----------- Sujet --------------*/
	//Stationnement - nom/nombrePlace/ville/nombreEtage
	//Voiture - marque/couleur/modele/puissance
	
	protected Label valeurNom;
	protected Label valeurNombrePlace;
	protected Label valeurVille;
	protected Label valeurNombreEtage;
	
	
	@Override
	public void start(Stage stade) throws Exception 
	{
		
		Pane panneau = new Pane();
		GridPane grilleStationnement = new GridPane();
		
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
		
		panneau.getChildren().add(grilleStationnement);
		
		
		
		stade.setScene(new Scene(panneau,500,500));
		stade.show();
				
		
		/*Test*/
		
		Stationnement stationnement = new Stationnement("Parking Roger","600 places","Matane","1");
		this.afficherStationnement(stationnement);
	}
	
	public void afficherStationnement(Stationnement stationnement)
	{
		this.valeurNom.setText(stationnement.getNom());
		this.valeurNombrePlace.setText(stationnement.getNombrePlace());
		this.valeurVille.setText(stationnement.getVille());
		this.valeurNombreEtage.setText(stationnement.getNombreEtage());
	}
	
	
	
	
	
}
