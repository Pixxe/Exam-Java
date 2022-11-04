package Utils;

import java.util.Scanner;

public class Utilitaire {
	
	public static String nomJoueurBlanc() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Nom du joueur blanc : ");
		return sc.nextLine();
	}
	
	public static String nomJoueurNoir() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Nom du joueur noir: ");
		return sc.nextLine();
	}
}
