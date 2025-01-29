package src;

import src.playing.playingPiece;
import src.playing.x;

public class Board {
	
	playingPiece pieces[][]; 
	
	Board(){
		pieces = new playingPiece[3][3];
		playingPiece empty = new x(' ');
		for(int x=0;x<3;x++) {
			for(int y=0;y<3;y++) {
				pieces[x][y] = empty;
			}
		}
	}
	
	boolean checkWinner(playingPiece move) {
		for(int x=0;x<3;x++) {
			boolean mind = true;
			for(int y=0;y<3;y++) {
				if(!pieces[x][y].equals(move)) {
					mind=false;
				}
			}
			if(mind) {
				return mind;
			}
		}
		
		for(int x=0;x<3;x++) {
			boolean mind = true;
			for(int y=0;y<3;y++) {
				if(!pieces[y][x].equals(move)) {
					mind=false;
				}
			}
			if(mind) {
				return mind;
			}
		}
		
		if(pieces[0][0].equals(move) && pieces[1][1].equals(move) && pieces[2][2].equals(move)) {
			return true;
		}else if(pieces[0][2].equals(move) && pieces[1][1].equals(move) && pieces[2][0].equals(move)) {
			return true;
		}
		return false;	
	}
	
	void displayBoard() {
		for(int x=0;x<3;x++) {
			for(int y=0;y<3;y++) {
				if(pieces[x][y]==null) {
					System.out.print("  | ");	
				}else {
					System.out.print(pieces[x][y].piece + " | ");					
				}
			}
			System.out.println();
		}
	}
}
