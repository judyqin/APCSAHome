package Unit1;

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapePanel extends JPanel
{
	public ShapePanel()
	{
		setBackground(Color.WHITE);
		setVisible(true);
	}

	public void update(Graphics window)
	{
		paint(window);
	}

	/*
	 *All of your test code should be placed in paint.
	 */
	public void paint(Graphics window)
	{
		window.setColor(Color.WHITE);
		window.fillRect(0,0,getWidth(), getHeight());
		window.setColor(Color.BLUE);
		window.drawRect(20,20,getWidth()-40,getHeight()-40);
		window.setFont(new Font("TAHOMA",Font.BOLD,18));
		window.drawString("CREATE YOUR OWN SHAPE!",40,40);

		window.setColor(Color.RED);
		window.drawRect(330, 170, 200, 150);
		//instantiate a Shape
		//tell your shape to draw
		
		window.setColor(Color.BLACK);
		window.drawLine(230, 140, 150, 300);
		window.drawLine(230, 140, 440, 330);
		window.drawLine(150, 300, 440, 330);
		//instantiate a Shape
		//tell your shape to draw
		
		window.setColor(Color.CYAN);
		window.drawOval(500, 300, 200, 200);
		//instantiate a Shape
		//tell your shape to draw
	}
}