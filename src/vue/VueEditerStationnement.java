package vue;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import modele.Stationnement;

public class VueEditerStationnement extends Application
{
	protected TextField valeurNom;
	protected TextField valeurNombrePlace;
	protected TextField valeurVille;
	protected TextField valeurNombreEtage;
	protected Button buttonEnregistrerStationnement;
	
	private int idStationnement = 0;
	
	@Override
	public void start(Stage stade) throws Exception 
	{
		Stationnement stationnement = new Stationnement("Parking Roger","600 places","Matane","1");
		
		VBox panneau = new VBox();
		GridPane grilleStationnement = new GridPane();
		this.buttonEnregistrerStationnement = new Button("Enregistrer");
		this.buttonEnregistrerStationnement.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) 
			{
				
				System.out.println(demanderStationnement().getNom() +" "+ demanderStationnement().getNombrePlace() +" "+ demanderStationnement().getVille() +" "+ demanderStationnement().getNombreEtage());				
			}
		});
		
		valeurNom = new TextField(stationnement.getNom());
		grilleStationnement.add(new Label("Nom : "), 0, 0);
		grilleStationnement.add(valeurNom, 1, 0);
		
		valeurNombrePlace = new TextField(stationnement.getNombrePlace());
		grilleStationnement.add(new Label("Nombre de place : "), 0, 1);
		grilleStationnement.add(valeurNombrePlace, 1, 1);
		
		valeurVille = new TextField(stationnement.getVille());
		grilleStationnement.add(new Label("Ville : "), 0, 2);
		grilleStationnement.add(valeurVille, 1, 2);
		
		valeurNombreEtage = new TextField(stationnement.getNombreEtage());
		grilleStationnement.add(new Label("Nombre d'etage : "), 0, 3);
		grilleStationnement.add(valeurNombreEtage, 1, 3);
		
		panneau.getChildren().add(new Label("Editer un stationnement"));
		panneau.getChildren().add(grilleStationnement);
		panneau.getChildren().add(this.buttonEnregistrerStationnement);
		
		stade.setScene(new Scene(panneau,500,500));
		stade.show();
		
	}
	
	public Stationnement demanderStationnement()
	{
		Stationnement stationnement = new Stationnement(this.valeurNom.getText(), this.valeurNombrePlace.getText(), this.valeurVille.getText(), this.valeurNombreEtage.getText());
		stationnement.setIdStationnement(idStationnement);
		
		return stationnement;
	}
	

}
