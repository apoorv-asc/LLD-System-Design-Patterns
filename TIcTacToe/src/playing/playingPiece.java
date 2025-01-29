package src.playing;

public abstract class playingPiece {
	public char piece;
	
	boolean equals(playingPiece p) {
		if(this.piece == p.piece) {
			return true;
		}else {
			return false;
		}
	}
	
}
