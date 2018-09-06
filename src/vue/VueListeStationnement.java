package vue;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class VueListeStationnement extends Application
{

	@Override
	public void start(Stage stade) throws Exception 
	{
		Pane panneau = new Pane();
		GridPane grilleStationnements = new GridPane();
		
		panneau.getChildren().add(grilleStationnements);
		stade.setScene(new Scene(panneau,500,500));
		stade.show();
	}
	
}
