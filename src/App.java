import vue.NavigateurDesVues;
import vue.VueAjouterStationnement;
import vue.VueEditerStationnement;
import vue.VueListeStationnement;
import vue.VueStationnement;

public class App 
{

	public static void main(String[] parametres) 
	{
		/*----------- Sujet --------------*/
		//Stationnement - nom/nombrePlace/ville/nombreEtages
		//Voiture - marque/couleur/modele/puissance
		/*----------------------------------*/
		
		//VueStationnement.launch(VueStationnement.class, parametres);
		
		//VueListeStationnement.launch(VueListeStationnement.class, parametres);
		
		//VueAjouterStationnement.launch(VueAjouterStationnement.class, parametres);

		//VueEditerStationnement.launch(VueEditerStationnement.class,parametres);
		
		NavigateurDesVues.launch(NavigateurDesVues.class, parametres);
	}

}
