package vue;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class VueStationnement extends Application
{

	/*----------- Sujet --------------*/
	//Stationnement - nom/nombrePlace/ville/nombreEtage
	//Voiture - marque/couleur/modele/puissance
	
	@Override
	public void start(Stage stade) throws Exception 
	{
		
		Pane panneau = new Pane();
		GridPane grilleStationnement = new GridPane();
		
		Label valeurNom = new Label("Parking de l'est");
		grilleStationnement.add(new Label("Nom : "), 0, 0);
		grilleStationnement.add(valeurNom, 1, 0);
		
		Label valeurNombrePlace = new Label("450 places");
		grilleStationnement.add(new Label("Nombre de place : "), 0, 1);
		grilleStationnement.add(valeurNombrePlace, 1, 1);
		
		Label valeurVille = new Label("Montreal");
		grilleStationnement.add(new Label("Ville : "), 0, 2);
		grilleStationnement.add(valeurVille, 1, 2);
		
		Label valeurNombreEtage = new Label("2 etages");
		grilleStationnement.add(new Label("Nombre d'etage : "), 0, 3);
		grilleStationnement.add(valeurNombreEtage, 1, 3);
		
		panneau.getChildren().add(grilleStationnement);
		
		
		
		stade.setScene(new Scene(panneau,500,500));
		stade.show();
				
	}
	
	
	
	
	
}
