package MemoryGame;
import javax.swing.JFrame;
import java.awt.Component;
import java.util.Scanner;

public class MemoryGame extends JFrame
{
	private static final int WIDTH = 1200;
	private static final int HEIGHT = 1300;

	public MemoryGame()
	{
		super("MEMORY GAME");
		setSize(WIDTH,HEIGHT);

		Board theGame = new Board();
		((Component)theGame).setFocusable(true);

		getContentPane().add(theGame);

		setVisible(true);
	}

	public static void main( String args[] )
	{
		MemoryGame run = new MemoryGame();
		int ans1, ans2; 
	
		Scanner keyboard = new Scanner(System.in);
		   
		System.out.println("Type the smaller number of your match: ");
		ans1 = keyboard.nextInt(); 
		System.out.println("Type the second square of your match: ");
		ans2 = keyboard.nextInt();
		
		if (ans1 == 1 && ans2 == 4) {
			System.out.println("Correct!");
		}
		if (ans1 == 2 && ans2 == 3) {
			System.out.println("Correct!");
		}
		if ((ans1 != 1 && ans2 != 4) && (ans1 != 2 && ans2 != 3)) {
			System.out.println("Try again");
		}
	}
}
