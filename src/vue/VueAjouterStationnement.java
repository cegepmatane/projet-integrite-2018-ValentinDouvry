package vue;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import modele.Stationnement;

public class VueAjouterStationnement extends Application
{
	protected TextField valeurNom;
	protected TextField valeurNombrePlace;
	protected TextField valeurVille;
	protected TextField valeurNombreEtage;
	
	@Override
	public void start(Stage stade) throws Exception 
	{
		VBox panneau = new VBox();
		GridPane grilleStationnement = new GridPane();
		
		
		valeurNom = new TextField("");
		grilleStationnement.add(new Label("Nom : "), 0, 0);
		grilleStationnement.add(valeurNom, 1, 0);
		
		valeurNombrePlace = new TextField("");
		grilleStationnement.add(new Label("Nombre de place : "), 0, 1);
		grilleStationnement.add(valeurNombrePlace, 1, 1);
		
		valeurVille = new TextField("");
		grilleStationnement.add(new Label("Ville : "), 0, 2);
		grilleStationnement.add(valeurVille, 1, 2);
		
		valeurNombreEtage = new TextField("");
		grilleStationnement.add(new Label("Nombre d'etage : "), 0, 3);
		grilleStationnement.add(valeurNombreEtage, 1, 3);
		
		panneau.getChildren().add(new Label("Ajouter un stationnement"));
		panneau.getChildren().add(grilleStationnement);
		panneau.getChildren().add(new Button("Enregistrer"));
		stade.setScene(new Scene(panneau,500,500));
		stade.show();
		
				
	}
	
	public Stationnement demanderStationnement()
	{
		Stationnement stationnement = new Stationnement(this.valeurNom.getText(), this.valeurNombrePlace.getText(),this.valeurVille.getText(), this.valeurNombreEtage.getText());
		
		return stationnement;
	}
	
	
}
