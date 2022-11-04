package echec;

import Utils.Utilitaire;

public class Executeur {
	
	public static void main(String[] args) {
		Game g = new Game(Utilitaire.nomJoueurBlanc(),Utilitaire.nomJoueurNoir());
		//on appel l'objet de la classe Game et non pas la classe Game
		//Static a été oublié dans la fonction, et String doit être en paramètre et non pas Character
		g.lancer();
	}
}
