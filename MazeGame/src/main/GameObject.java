package main;

public abstract class GameObject {
	int x,y;
	int type; // 1 = wall, 2 = player, 3 = treasure, 4 = door, 5 = Laser
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
}
