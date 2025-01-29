package src;

import src.playing.o;
import src.playing.playingPiece;
import src.playing.x;

public class Player {
	
	playingPiece p;
	
	Player(String p) {
		this.p = selectPlayer(p);
	}
	
	playingPiece selectPlayer(String p){
		if(p.equalsIgnoreCase("Player 1")) {
			return new o('O');
		}else {
			return new x('X');
		}
	}
	
}
