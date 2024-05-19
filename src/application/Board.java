package application;

public class Board {
	public int score;
	public int[][] grid;
	
	// Default no-arg constructor
	public Board() {
		score = 0;
		grid = new int[20][5];
	}
	
	// Getter and setter for score
	public int getScore() {
		return this.score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
}
