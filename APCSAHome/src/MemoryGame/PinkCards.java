package MemoryGame;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PinkCards extends PinkCard {

	private PinkCard[][] p; 
	private ArrayList<Integer> r; 
	private int r1, r2, r3, r4, ran1, ran2, ran3, ran4;
	private Random randomGenerator;
	
	public PinkCards() {

	}
	
	public PinkCards(int x, int y) {
		r = new ArrayList<Integer>();
		
		r.add(0);
		r.add(1);
		r.add(2);
		r.add(3);
		r.add(10);
		r.add(11);
		r.add(12);
		r.add(13);
		r.add(20);
		r.add(21);
		r.add(22);
		r.add(23);
		r.add(30);
		r.add(31);
		r.add(32);
		r.add(33);
		
		randomGenerator = new Random();
		
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
	
	public PinkCard[][] rand() {
		
		r1 = r.get(randomGenerator.nextInt(r.size()));
	    p[r1/10][r1%10].setPos(1000, 1000);
	    r.remove(new Integer(r1));
	    
	    r2 = r.get(randomGenerator.nextInt(r.size())); 
	    p[r2/10][r2%10].setPos(1000, 1000);
	    r.remove(new Integer(r2));
		
//	    if (p[ran1][ran2].getX() != 1000 && p[ran1][ran2].getY() != 1000 && p[r1][r2] != p[ran3][ran4]) {
//	    	r1 = ran1; 
//	    	r2 = ran2; 
//	    }
//	    if (p[ran3][ran4].getX() != 1000 && p[ran3][ran4].getY() != 1000 && p[ran1][ran2] != p[ran3][ran4]) {
//	    	r3 = ran3; 
//	    	r4 = ran4; 
//	    }
//	    
//       	if (p[r1][r2] != p[r3][r4] && p[r1][r2].getX() != 1000 && p[ran1][ran2].getY() != 1000
//       			&& p[r3][r4].getX() != 1000 && p[ran3][ran4].getY() != 1000) {
//       		p[r1][r2].setPos(1000, 1000);
//    		p[r3][r4].setPos(1000, 1000);
//       	}
		System.out.println(r1);
		System.out.println(r2);
		return p; 
	}
	
	public PinkCard[][] flip(int r, int c, int r1, int c1) {
		p[r][c].setPos(1000, 1000);
		p[r1][c1].setPos(1000, 1000);
		return p; 
	}
	
	public PinkCard[][] flip1() {
		flip(0,0,3,0);
		return p; 
	}
	
	public int getrand1() {
		return r1; 
	}
	
	public int getrand2() {
		return r2; 
	}
	
	public int getrand3() {
		return r3; 
	}
	
	public int getrand4() {
		return r4; 
	}
	
//	public PinkCard[][] remove(PinkCard[][] array) {
//
//        List<PinkCard[]> pinks = new ArrayList<PinkCard[]>(Arrays.asList(array));
//
//        for (int i = array.length-1; i >= 0; i--) {
//            for (int j = 0; j < p.size(); j++) {
//                if (array[i][0] == p.get(j)) {
//                    System.out.println("removing " + p.get(j));
//                    pinks.remove(i);
//                }
//            }
//        }
//        PinkCard[][] remaining = (PinkCard[][]) pinks.toArray(new PinkCard[][] {});
//        return remaining;
//    }

}
