package echec;

public class Case {
	private Position position;
	private Piece piece;

//  L'attribut affichage n'est jamais appelé on peut donc le supprimé	
//	private String affichage;

	public Case(Position position) {
		this.position = position;
	}

	public void positionne(Piece p) {
		// Nous ne sommes pas obligé d'utiliser this
		this.piece = p;
	}

	public Position getPosition() {
		return position;
	}

	public void vider() {
		piece = null;
	}

	public Piece getPiece() {
		return piece;
	}

	@Override
	public String toString() {
		return ("Case" + position + piece);
	}

}
