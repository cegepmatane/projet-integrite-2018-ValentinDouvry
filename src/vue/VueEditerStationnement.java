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
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import modele.Stationnement;
import modele.Voiture;

public class VueEditerStationnement extends Scene
{
	protected TextField valeurNom;
	protected TextField valeurNombrePlace;
	protected TextField valeurVille;
	protected TextField valeurNombreEtage;
	protected Button actionEnregistrerStationnement = null;;
	//GridPane grilleVoiture = new GridPane();
	
	private int idStationnement = 0;
	
	private ControleurStationnement controleur = null;
	
	
	public VueEditerStationnement()
	{
		super(new VBox(),600,600);
		VBox panneau = (VBox) this.getRoot();
		//Stationnement stationnementTest = new Stationnement("Parking Roger","600 places","Matane","1");
		
		/*Voiture voitureTest1 = new Voiture("Audi", "R8", "598 ch", "Rouge");
		Voiture voitureTest2 = new Voiture("Peugeot", "206", "75 ch", "Blanche");
		Voiture voitureTest3 = new Voiture("BMW", "R6", "240 ch", "Noir");
		
		List listeVoituresTest = new ArrayList<Voiture>();
		listeVoituresTest.add(voitureTest1);
		listeVoituresTest.add(voitureTest2);
		listeVoituresTest.add(voitureTest3);*/	
		
		
		GridPane grilleStationnement = new GridPane();
		
		this.actionEnregistrerStationnement = new Button("Enregistrer");
		this.actionEnregistrerStationnement.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) 
			{
				controleur.notifierEnregistrerStationnement();			
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
		
		panneau.getChildren().add(new Label("Editer un stationnement"));
		panneau.getChildren().add(grilleStationnement);
		panneau.getChildren().add(this.actionEnregistrerStationnement);
		
		//panneau.getChildren().add(grilleVoiture);
		
		
		
		//afficherStationnement(stationnementTest);
		//afficherListeVoiture(listeVoituresTest);
		
		
	}
	
	public Stationnement demanderStationnement()
	{
		Stationnement stationnement = new Stationnement(this.valeurNom.getText(), this.valeurNombrePlace.getText(), this.valeurVille.getText(), this.valeurNombreEtage.getText());
		stationnement.setIdStationnement(idStationnement);
		
		return stationnement;
	}
	
	public void afficherStationnement(Stationnement stationnement)
	{
		this.idStationnement = stationnement.getIdStationnement();		
		this.valeurNom.setText(stationnement.getNom());
		this.valeurNombrePlace.setText(stationnement.getNombrePlace());
		this.valeurVille.setText(stationnement.getVille());
		this.valeurNombreEtage.setText(stationnement.getNombreEtage());
	}
	
	/*public void afficherListeVoiture(List<Voiture> listeVoitures)
	{
		this.grilleVoiture.getChildren().clear();
		int item = 0;
		for(Voiture voiture : listeVoitures)
		{
			this.grilleVoiture.add(new Label(voiture.getMarque() + "	"), 0, item);
			this.grilleVoiture.add(new Label(voiture.getModele() + "	"), 1, item);
			this.grilleVoiture.add(new Label(voiture.getPuissance() + "	"), 2, item);
			this.grilleVoiture.add(new Label(voiture.getCouleur() + "	"), 3, item);
			this.grilleVoiture.add(new Button("Modifier"), 4, item);
			item++;
		}		
	}*/
	
	public void setControleur(ControleurStationnement controleur)
	{
		this.controleur = controleur;
	}
	

}
