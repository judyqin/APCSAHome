package MemoryGame;
import javax.swing.JFrame;
import java.awt.Component;

public class MemoryGame extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

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
	}
}
