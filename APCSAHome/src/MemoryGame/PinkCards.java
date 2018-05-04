package MemoryGame;

import java.awt.Color;
import java.util.ArrayList;

public class PinkCards extends PinkCard {

	private PinkCard[][] p; 
	
	public PinkCards (int x, int y) {
		p = new PinkCard[4][4];
		
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p[0].length; j++) {
				p[i][j] = new PinkCard(x, y);
				x = x + 200;
			}
			x = 200; 
			y = y + 150; 
		}
	}
	
	public PinkCard[][] pMatrix() {
		return p;
	}
	
}
