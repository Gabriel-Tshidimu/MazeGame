package main;

import java.awt.Color;
import java.awt.Rectangle;

public class Treasure extends GameObject {	
	
	public  Treasure(int x, int y) {
		this.x = x;
		this.y = y;
		this.type = 3;
		this.color = Color.yellow;
	}

	@Override
	public void tick() {
		
	}
	@Override
	public Rectangle getBounds() {
		return new Rectangle(x,y,32,32);
		
	}
}
