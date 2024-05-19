package application;

import java.util.Random;

public class LetterBlock {
	// Define class-wide variables
	public char randomLetter;
	public int height;
	public int width;
	
	// Default no-arg constructor
	public LetterBlock() {
		setLetter(); // Set the letter of the block
		height = 50;
		width = 50;
	}
	
	// Getter for letter
	public char getLetter() {
		return this.randomLetter;
	}
	
	
	// Setter for letter
	// TODO: add functionality to generate more common/lower point letters more often
	public void setLetter() {
		Random random = new Random();
		randomLetter = (char)(random.nextInt(26) + 'a');
	}
	
}
