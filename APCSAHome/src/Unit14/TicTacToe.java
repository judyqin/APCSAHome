package Unit14;

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		mat = new char[0][0];
	}

	public TicTacToe(String game)
	{
		mat = new char[3][3];
		char[] g = game.toCharArray();
		
		int count = 0; 
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[i][j] = g[count];
				count++; 
			}
		}
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println( );
		}
		
	}

	public String getWinner()
	{
		String output = "";
		for (int i = 0; i < mat.length; i++) {
			if (mat[i][0] == mat[i][1] && mat[i][1] == mat[i][2]) {
			output += mat[i][0] + " wins horizontally!";
			}
		}
		for (int i = 0; i < mat.length; i++) {
			if (mat[0][i] == mat[1][i] && mat[1][i] == mat[2][i]) {
			output += mat[0][i] + " wins vertically!"; 
			}
		}
		if (((mat[0][0]==mat[1][1])&&(mat[1][1]==mat[2][2]))){
			output += mat[0][0] + " wins diagonally!";
		}

		if ((mat[0][2]==mat[1][1])&&(mat[1][1]==mat[2][0])) { 
			output += mat[0][2] + " wins diagnally!";
		}
		if (output.equals("")) {
			output += "cat's game - no winner!";
		}
		
		return output;
	}

	public String toString()
	{
		String output="";
		output = getWinner();
		
		return output+"\n\n";
	}
}