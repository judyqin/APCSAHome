package Unit15;

import java.awt.Color;

public class Wall extends Block {
	
	public Wall() {
		super(200,200);
		setWidth(10);
		setHeight(10);
		setColor(Color.WHITE);
	}
	
	public Wall(int x, int y) {
		super(x, y); 
		setWidth(10);
		setHeight(10);
		setColor(Color.WHITE);
	}
	
	public Wall(int x, int y, int w, int h) {
		super(x, y, w, h); 
		setColor(Color.WHITE);
	}
	
	public Wall(int x, int y, int w, int h, Color c) {
		super(x, y, w, h, c); 
	}

}
