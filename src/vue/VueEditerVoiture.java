package vue;

import action.ControleurStationnement;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import modele.Voiture;

public class VueEditerVoiture extends Scene
{
	protected TextField valeurMarque;
	protected TextField valeurModele;
	protected TextField valeurPuissance;
	protected TextField valeurCouleur;	
	protected Button actionEnregistrerVoiture = null;	
	private int idVoiture = 0;
	
	private ControleurStationnement controleur = null;
	
	public VueEditerVoiture()
	{
		super(new VBox(),600,600);
		VBox panneau = (VBox) this.getRoot();
	
		GridPane grilleVoiture = new GridPane();
		this.actionEnregistrerVoiture = new Button("Enregistrer");
		this.actionEnregistrerVoiture.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) 
			{
				controleur.notifierEnregistrerVoiture();
			}
		});
		
		valeurMarque = new TextField("");
		grilleVoiture.add(new Label("Marque : "), 0, 0);
		grilleVoiture.add(valeurMarque, 1, 0);
		
		valeurModele = new TextField("");
		grilleVoiture.add(new Label("Modele : "), 0, 1);
		grilleVoiture.add(valeurModele, 1, 1);
		
		valeurPuissance = new TextField("");
		grilleVoiture.add(new Label("Puissance : "), 0, 2);
		grilleVoiture.add(valeurPuissance, 1, 2);
		
		valeurCouleur = new TextField("");
		grilleVoiture.add(new Label("Couleur : "), 0, 3);
		grilleVoiture.add(valeurCouleur, 1, 3);
		
		panneau.getChildren().add(new Label("Editer une voiture"));
		panneau.getChildren().add(grilleVoiture);
		panneau.getChildren().add(this.actionEnregistrerVoiture);
	}
	
	public void setControleur(ControleurStationnement controleur)
	{
		this.controleur = controleur;
	}
	
	public Voiture demanderVoiture()
	{
		Voiture voiture = new Voiture(this.valeurMarque.getText(), this.valeurModele.getText(), this.valeurPuissance.getText(), this.valeurCouleur.getText());
		voiture.setIdVoiture(idVoiture);
		
		return voiture;
	}
	
	public void afficherVoiture(Voiture voiture)
	{
		this.idVoiture = voiture.getIdStationnement();
		this.valeurMarque.setText(voiture.getMarque());
		this.valeurModele.setText(voiture.getModele());;
		this.valeurPuissance.setText(voiture.getPuissance());
		this.valeurCouleur.setText(voiture.getCouleur());
		
	}
	
}
