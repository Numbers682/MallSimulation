package core;

public class Floor {

	int frameWidth, frameHeight;
	int[][] grid;
	
	public Floor(int frameWidth, int frameHeight) {
		this.frameWidth = frameWidth;
		this.frameHeight = frameHeight;
		grid = new int[this.frameWidth][this.frameHeight];
	}
}
