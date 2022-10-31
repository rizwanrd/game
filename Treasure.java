package com.rizwan.TextGame;

import java.util.Random;

public class Treasure {
	private Coordinate currentPos = new Coordinate();
	private char symbol = 'T';
	
	private int gold;
	
	Random random = new Random();
	
	public Treasure(int gridSize) {
		currentPos.randomise(gridSize);
		gold = random.nextInt(1000); 
	}
	
	public int getGold() {
		return this.gold;
	}
	
	public Coordinate getPosition() {
		return this.currentPos;
	}
	
	public String getDistanceFrom(Player p) {
	
		return "";
	}
	
}
