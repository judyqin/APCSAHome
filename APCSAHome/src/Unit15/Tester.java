package Unit15;

import javax.swing.JFrame;
import java.awt.Component;

public class Tester extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public Tester()
	{
		super("PONG TESTER");
		setSize(WIDTH,HEIGHT);
		
		//getContentPane().add(new BlockTestTwo());		
		
		//uncomment when you are ready to test the Ball
		//getContentPane().add(new BallTestTwo());		
		
//		PaddleTestTwo padTest = new PaddleTestTwo();
//		((Component)padTest).setFocusable(true);			
//		getContentPane().add(padTest);
		
		
		Pong game = new Pong();
		((Component)game).setFocusable(true);			
		getContentPane().add(game);
		
//		BreakOut game = new BreakOut();
//		((Component)game).setFocusable(true);			
//		getContentPane().add(game);
		
//		AirHockey game = new AirHockey();
//		((Component)game).setFocusable(true);			
//		getContentPane().add(game);
				
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		Tester run = new Tester();
	}
}