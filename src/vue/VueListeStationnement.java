package vue;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import modele.Stationnement;

public class VueListeStationnement extends Application
{
	protected GridPane grilleStationnements;
	

	@Override
	public void start(Stage stade) throws Exception 
	{
		Pane panneau = new Pane();
		grilleStationnements = new GridPane();
		
		
		panneau.getChildren().add(grilleStationnements);
		stade.setScene(new Scene(panneau,600,600));
		stade.show();
		
		/*TEST*/
		List listeStationnementsTest = new ArrayList<Stationnement>();
		listeStationnementsTest.add(new Stationnement("Parking de la neige", "150 places", "Paris", "3"));
		listeStationnementsTest.add(new Stationnement("Parking de la reine", "400 places", "Londre", "4"));
		listeStationnementsTest.add(new Stationnement("Parking de la courtoisie", "12 places", "Montreal", "1"));
		listeStationnementsTest.add(new Stationnement("Parking de Vincent", "900 places", "Strasbourg", "10"));
		listeStationnementsTest.add(new Stationnement("Parking de Roger", "189 places", "Valence", "2"));
		
		
		
		this.afficherListeStationnement(listeStationnementsTest);
		
		
	}
	
	public void afficherListeStationnement(List<Stationnement> listeStationnements)
	{
		int numero = 0;
		this.grilleStationnements.add(new Label("Nom : "), 0, numero);
		this.grilleStationnements.add(new Label("Nombre de place : "), 1, numero);
		this.grilleStationnements.add(new Label("Ville : "), 2, numero);
		this.grilleStationnements.add(new Label("Nombre d'etages : "), 3, numero);
		
		
		for(Stationnement stationnement:listeStationnements)
		{
			numero++;
			this.grilleStationnements.add(new Label(stationnement.getNom()), 0, numero);
			this.grilleStationnements.add(new Label(stationnement.getNombrePlace()), 1, numero);
			this.grilleStationnements.add(new Label(stationnement.getVille()), 2, numero);
			this.grilleStationnements.add(new Label(stationnement.getNombreEtage()), 3, numero);
			this.grilleStationnements.add(new Button("Modifier"), 4, numero);
		}
	}
	
	
}
