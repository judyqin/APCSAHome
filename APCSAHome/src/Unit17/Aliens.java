package Unit17;

import java.awt.Color;
import java.util.ArrayList;

public class Aliens extends Alien {

	private Alien[][] m; 
	
	public Aliens (int x, int y, int s) {
		m = new Alien[3][3];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				m[i][j] = new Alien(x, y, s);
				x = x + 80;
			}
			y = y + 80; 
		}
	}
	
	public Alien[][] alienMatrix() {
		return m;
	}
	
//	private ArrayList<Alien> aliens; 
//	
//	public Aliens(int num, int x, int y, int s) {
//		for (int i = 0; i < num; i++) {
//			aliens.add(new Alien(x, y, s)); 
//			x = x + 150; 
//		}
//		y = y + 120; 
//	}
//	
//	private ArrayList<Alien> returnMatrix() { 
//		return aliens; 
//	}
	
}
