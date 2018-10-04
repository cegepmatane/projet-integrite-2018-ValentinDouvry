package vue;

import java.util.ArrayList;
import java.util.List;

import action.ControleurStationnement;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import modele.Stationnement;

public class VueListeStationnement extends Scene
{
	protected GridPane grilleStationnements;
	
	private ControleurStationnement controleur = null;
	
	private Button actionNaviguerAjouterStationnement;
	

	
	public VueListeStationnement()
	{
		super(new GridPane(),600,600);
		grilleStationnements = (GridPane) this.getRoot();
		this.actionNaviguerAjouterStationnement = new Button("Ajouter un stationnement");
				
	}
	
	public void afficherListeStationnement(List<Stationnement> listeStationnements)
	{
		
		this.grilleStationnements.getChildren().clear();
		
		int numero = 0;
		this.grilleStationnements.add(new Label("Nom : "), 0, numero);
		this.grilleStationnements.add(new Label("Nombre de place : "), 1, numero);
		this.grilleStationnements.add(new Label("Ville : "), 2, numero);
		this.grilleStationnements.add(new Label("Nombre d'etages : "), 3, numero);
		
		
		for(Stationnement stationnement:listeStationnements)
		{
			Button actionEditerStationnement = new Button("Modifier");
			actionEditerStationnement.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) 
				{
					controleur.notifierNaviguerEditerStationnement(stationnement.getIdStationnement());
				}
			});
			numero++;
			this.grilleStationnements.add(new Label(stationnement.getNom()), 0, numero);
			this.grilleStationnements.add(new Label(stationnement.getNombrePlace()), 1, numero);
			this.grilleStationnements.add(new Label(stationnement.getVille()), 2, numero);
			this.grilleStationnements.add(new Label(stationnement.getNombreEtage()), 3, numero);
			this.grilleStationnements.add(actionEditerStationnement, 4, numero);
		}
		
		this.actionNaviguerAjouterStationnement.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent arg0) {
				controleur.notifierNaviguerAjouterStationnement();
			}
		});
	}
	
	public void setControleur(ControleurStationnement controleur)
	{
		this.controleur = controleur;
	}
	
	
}
