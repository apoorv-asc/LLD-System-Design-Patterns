package src;

import java.util.*;

public class Game {
	
	static Player player1;
	static Player player2;
	static Queue<Player> q = new LinkedList<>();
	
	static Board board;
	
	
	Game(){
//		initializeGame();
	}

	private static void initializeGame() {
		player1 = new Player("player 1");
		player2 = new Player("player 2");
		
		q.add(player1);
		q.add(player2);
		
		board = new Board();
	}
	
	public static void main(String ar[]) {
		initializeGame();
		Scanner R= new Scanner(System.in);
		
//		boolean mind = false;
		while(true) {
			Player curr = q.remove();
			board.displayBoard();
			
			System.out.println("Enter position");
			int x = R.nextInt();
			int y = R.nextInt();
			board.pieces[x][y] = curr.p;
			boolean val = board.checkWinner(curr.p);
			System.out.println(val);
			if(val) {
				System.out.println("\n\n---------------------------\n");
				board.displayBoard();
				System.out.println("---------------------------\n\n");
				System.out.println(curr.p.piece + " wins the game");
				break;
			}
			q.add(curr);
			
		}
	}
	
}
