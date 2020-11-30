package locs;

public abstract class Location{
	private int width;
	private int height;

	public Location (int width, int height){
		this.width = width;
		this.height = height;
	}

	public abstract void describe();
	public abstract void ruin();
}