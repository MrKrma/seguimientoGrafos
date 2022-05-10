package model;


public class Vertex {
	//----------------------------------------------------------- Attributes
	private int value;
	private boolean visited;
	
	//----------------------------------------------------------- Getters and Setters
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
	//----------------------------------------------------------- Constructor
	public Vertex(int value, boolean visited) {
		super();
		this.value = value;
		this.visited = visited;
	}
	
	
}
