package model;

import java.util.ArrayList;
import java.util.HashMap;

public class Controller {
	//----------------------------------------------------------- Attributes
	private Graph graph;

	//----------------------------------------------------------- Getters and Settes
	public Graph getGraph() {
		return graph;
	}

	public void setGraph(Graph graph) {
		this.graph = graph;
	}
	//----------------------------------------------------------- Constructor
	public Controller() {
		graph = new Graph(new HashMap<Vertex, ArrayList<Vertex>>());
	}
	//----------------------------------------------------------- Methods
	public void addVertex(int value) {
		Vertex theNew = new Vertex(value, false);
		graph.addVertex(theNew, new ArrayList<Vertex>());
	}
	public void addNext(int value, ArrayList<Integer> n) {
		graph.addNext(value, n);
	}
	
	public void dfs(int value) {
		graph.dfs(value);
	}
	
	public void bfs(int value) {
		graph.bfs(value);
	}
	
	public boolean allVisited() {
		return graph.allVisited();
	}
}
