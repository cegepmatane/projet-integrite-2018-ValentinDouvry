package vue;

import action.ControleurStationnement;
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

public class VueAjouterStationnement extends Scene
{
	protected TextField valeurNom;
	protected TextField valeurNombrePlace;
	protected TextField valeurVille;
	protected TextField valeurNombreEtage;
	
	protected Button actionEnregistrerStationnement = null;
	
	private ControleurStationnement controleur = null;
	
	
	public VueAjouterStationnement()
	{
		super(new VBox(),600,600);
		VBox panneau = (VBox) this.getRoot();
		
		GridPane grilleStationnement = new GridPane();
		this.actionEnregistrerStationnement = new Button("Enregistrer");
		this.actionEnregistrerStationnement.setOnAction(new EventHandler<ActionEvent>() 
		{			
			@Override
			public void handle(ActionEvent arg0)
			{
					controleur.notifierEnregistrerNouveauStationnement();			
			}
		});
		
		
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
		panneau.getChildren().add(this.actionEnregistrerStationnement);
		
		
				
	}
	
	public Stationnement demanderStationnement()
	{
		Stationnement stationnement = new Stationnement(this.valeurNom.getText(), this.valeurNombrePlace.getText(),this.valeurVille.getText(), this.valeurNombreEtage.getText());
		
		return stationnement;
	}
	
	public void setControleur(ControleurStationnement controleur)
	{
		this.controleur = controleur;
	}
	
	
}
