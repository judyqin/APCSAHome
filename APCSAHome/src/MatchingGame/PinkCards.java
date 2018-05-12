package MatchingGame;

import java.util.ArrayList;
import java.util.Random;

public class PinkCards extends PinkCard {

	private PinkCard[][] p; 
	private ArrayList<Square> cardSet = new ArrayList<Square>();
	private ArrayList<Square> twoFlipCardsPair = new ArrayList<Square>();
	private ArrayList<Integer> cardIndex = new ArrayList<Integer>();
	private ArrayList<Integer> matchedCards = new ArrayList<Integer>();
	private Random randomGenerator = new Random();
	private int r1, r2;		
	
	public PinkCards() {
	}
	
	public PinkCards(int x, int y) {
		
		cardSet.add(new BalloonsCard(200, 150));
		cardSet.add(new BeachCard(400, 150));
		cardSet.add(new CupcakeCard(600, 150));
		cardSet.add(new DogCard(800, 150));
		cardSet.add(new FlowerCard(200, 300));
		cardSet.add(new IceCreamCard(400, 300));
		cardSet.add(new PigCard(600, 300));
		cardSet.add(new FlowerCard(800, 300));
		cardSet.add(new CupcakeCard(200, 450)); 
		cardSet.add(new HouseCard(400, 450));
		cardSet.add(new BeachCard(600, 450));
		cardSet.add(new PigCard(800, 450));
		cardSet.add(new DogCard(200, 600));
		cardSet.add(new BalloonsCard(400, 600));
		cardSet.add(new HouseCard(600, 600));
		cardSet.add(new IceCreamCard(800, 600));
		
		for (int i= 0; i <=15; i++)
		{
			cardIndex.add(i);
		}
		
		p = new PinkCard[4][4];
//		System.out.println("PinkCards: xPos = " + x + ", yPos = " + y + ", p.length = " + p.length);
		
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p[0].length; j++) {
				p[i][j] = new PinkCard(x, y);
				x = x + 200;
			}
			x = 200; 
			y = y + 150; 
		}
		
//		for (int i = 0; i < p.length; i++) {
//			for (int j = 0; j < p[0].length; j++) {
//				System.out.println("p[" + i + "]"+"[" + j + "]" + " = " + p[i][j]);
//			}
//		}
		
	}
	
	public PinkCard[][] pMatrix() { 
		return p;
	}
	
	public ArrayList<Square> rand() {
		
//		System.out.println("Begin PinkCard[][] rand()");
		boolean isR1Good = true, isR2Good = true;
		int increment1 = 0; 
		int increment2 = 0; 

		do 
		{
			r1 = randomGenerator.nextInt(16);
//			System.out.println("this is r1 " + r1);
			isR1Good = true; 
			if (matchedCards.size() > 0) {
				increment1 = 0; 
				do {
					if (r1 == matchedCards.get(increment1)) {
//						System.out.println("this is r1 when matched " + r1);
						isR1Good = false; 
					}
					increment1++; 
				} while (isR1Good == true && increment1 < matchedCards.size());
			}
		} 
		while(!isR1Good);

//		System.out.println("r1 good before r2");
		
		do 
		{
			r2 = randomGenerator.nextInt(16);
//			System.out.println("this is r2 " + r2);
			isR2Good = true; 
			if (r1 != r2) { 
				if (matchedCards.size() > 0) {
					increment2 = 0; 
					do {
						if ((r2 == matchedCards.get(increment2))) {
//							System.out.println("this is r2 when matched "+ r2);
							isR2Good = false; 
						}
						increment2++; 
					} while (isR2Good == true && increment2 < matchedCards.size());
				}
			}
			else {
				isR2Good = false; 
			}
		}
		while(!isR2Good);
		
//		cardIndex.remove(new Integer(r2));
		
//		System.out.println("r1=" + r1 + ", r2=" + r2);

		if((twoFlipCardsPair != null) && (twoFlipCardsPair.size() != 0))
		{
//			for(int i=0; i < twoFlipCardsPair.size(); i++)
//			{
//				System.out.println(twoFlipCardsPair.size());
//				twoFlipCardsPair.remove(0);
//				System.out.println(twoFlipCardsPair.size());
//			}
			twoFlipCardsPair.clear();
		}
		
		
		twoFlipCardsPair.add(cardSet.get(r1));
		twoFlipCardsPair.add(cardSet.get(r2));
		
		
//		for (int i = 0; i < cardIndex.size(); i++)
//		{
//			System.out.println("cardIndex: " + i + " = " + cardIndex.get(i));
//		}
		
		return twoFlipCardsPair;
	  
	}

	public ArrayList<Square> getTwoFlipCardsPair() {
		return twoFlipCardsPair;
	}
	
	public void addMatch() {
		matchedCards.add(new Integer(r1));
		matchedCards.add(new Integer(r2));
//		System.out.println(r1);
//		System.out.println(r2);
	}
	
//	public ArrayList<Square> removeInt(ArrayList<Square> arr, int num) {
//		arr.remove(new Integer(num));
//		return arr; 
//	}
//	
	public int r1() {
		return r1; 
	}
	
	public int r2() {
		return r2; 
	}
	
}

//EXTRA CODE THAT DIDN'T END UP WORKING
//	public ArrayList<Integer> removeCardIndex() {
//		cardIndex.remove(new Integer(r1));
//		cardIndex.remove(new Integer(r2));
//		return cardIndex; 
//	}
//	public PinkCard[][] rand() {
//		
//		r1 = r.get(randomGenerator.nextInt(r.size()));
//	    p[r1/10][r1%10].setPos(1000, 1000);
//	    r.remove(new Integer(r1));
//	    
//	    r2 = r.get(randomGenerator.nextInt(r.size())); 
//	    p[r2/10][r2%10].setPos(1000, 1000);
//	    r.remove(new Integer(r2));
//		
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
//		System.out.println(r1);
//		System.out.println(r2);
//		return p; 
//	}
//	
//	public PinkCard[][] flip(int r, int c, int r1, int c1) {
//		ran1 = r; 
//		ran2 = c; 
//		ran3 = r1; 
//		ran4 = c1; 
//		p[r][c].setPos(1000, 1000);
//		p[r1][c1].setPos(1000, 1000);
//		return p; 
//	}
//	
//	public PinkCard[][] flip1() {
//		flip(0,0,3,0);
//		return p; 
//	}
//	
//	public PinkCard[][] flip2() {
//		flip(0,1,2,2);
//		return p; 
//	}
//	
//	public PinkCard[][] flip3() {
//		flip(1,1,1,0);
//		return p; 
//	}
//	
//	
//	public int getrand1() {
//		return ran1; 
//	}
//	
//	public int getrand2() {
//		return ran2; 
//	}
//	
//	public int getrand3() {
//		return ran3; 
//	}
//	
//	public int getrand4() {
//		return ran4; 
//	}


	
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
//
//}
