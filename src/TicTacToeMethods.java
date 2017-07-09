import java.util.Scanner;


public class TicTacToeMethods {

	public TicTacToeMethods() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Tic-Tac-Toe!");
		char [][] board = fillBoard();
		char player='X';
		boolean game=true;
		printBoard(board);
		while (game){
			
			
			System.out.println(player + ", pick the first coordinate");
			int xcoor = scan.nextInt();
			System.out.println(player + ", pick the second coordinate");
			int ycoor = scan.nextInt();
			boolean bevs = checkEmpty(board, xcoor, ycoor);
			if (bevs==true){
				placePiece(board, xcoor, ycoor, player);
				if (checkHorWin(board, player)==true){
					System.out.println(player + " Wins!!");
					game=false;
				}
				else if (checkVerWin(board, player)==true){
					System.out.println(player + " Wins!!");
					game=false;
				}
				else if (checkDigWin(board, player)==true){
					System.out.println(player + " Wins!!");
					game=false;
				}
				else if (checkStalemate(board)==true){
					System.out.println("It's a TIE!");
					game=false;
				}
				player=switchPlayer(player);
			}
			else{
				System.out.println("That place is taken! Try again!");
			}
			printBoard(board);
			
		}
		
	}
	
	public static char [][] fillBoard(){
		
		char [][] board = new char [3][3];
		for (int x=0; x<3; x++){
			for (int y=0; y<3; y++){
				board [x][y]='-';
			}
		}
		return board;
	}
	
	public static void printBoard(char [][] board){
		
		System.out.println("DA BOARD");
		for (int x=0; x<3; x++){
			for (int y=0; y<3; y++){
				System.out.print(board[x][y]);
			}
			System.out.println();
		}
		
	}
	
	public static boolean checkEmpty(char [][] board, int x, int y){
		if (board[x][y]=='-'){
			return true;
		}
		return false;
		
	}
	
	public static void placePiece(char [][] board, int x, int y, char u){
		board[x][y]=u;
	}
	
	public static char switchPlayer(char player){
		if (player=='X'){
			player='O';
		}
		else if (player=='O'){
			player='X';
		}
		return player;
	}
	
	public static boolean checkHorWin(char[][]board, char player){
		for (int x=0; x<3; x++){
			if (board[x][0]==player&&board[x][1]==player&&board[x][2]==player){
				return true;
			}
		}
		return false;
	}
	
	public static boolean checkVerWin(char[][]board, char player){
		for (int y=0; y<3; y++){
			if (board[0][y]==player&&board[1][y]==player&&board[2][y]==player){
				return true;
			}
			
		}
		return false;
	}
	
	public static boolean checkDigWin(char[][]board, char player){
		if (board[0][0]==player&&board[1][1]==player&&board[2][2]==player){
			return true;
		}
		else if (board[0][2]==player&&board[1][1]==player&&board[2][0]==player){
			return true;
		}
		return false;
	}
	
	public static boolean checkStalemate(char[][]board){
		for (int x=0; x<3; x++){
			for (int y=0; y<3; y++){
				if (board[x][y]=='-'){
					return false;
				}
			}
		}
		return true;
	}

}

//public - who can see it and modify it
//static - not a big deal @ST - when you can't change it?
//char - need to return