package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
	//----------------------------------------------------------- Attributes
	private HashMap<Vertex, ArrayList<Vertex>> graph;
	private ArrayList<Vertex> arr;

	//----------------------------------------------------------- Getters and Setters
	public HashMap<Vertex, ArrayList<Vertex>> getGraph() {
		return graph;
	}


	public void setGraph(HashMap<Vertex, ArrayList<Vertex>> graph) {
		this.graph = graph;
	}

	//----------------------------------------------------------- Constructor
	public Graph(HashMap<Vertex, ArrayList<Vertex>> graph) {
		this.graph = graph;
		this.arr = new ArrayList<>();
	}
	
	//----------------------------------------------------------- Methods
	public void addVertex(Vertex v, ArrayList<Vertex> next) {
		arr.add(v);
		graph.put(v, next);
	}
	
	public void addNext(int v, ArrayList<Integer> next) {
		ArrayList<Vertex> theArr = new ArrayList<>();
		for(int i : next) {
			theArr.add(arr.get(i));
		}
		graph.replace(arr.get(v-1), theArr);
	}
	
	public void dfs(int value) {
		arr.get(value-1).setVisited(true);
		ArrayList<Vertex> aux = graph.get(arr.get(value-1));
		for(Vertex i : aux) {
			if(!i.isVisited()) {
				dfs(i.getValue());
			}
		}
	}
	
	public void bfs(int value) {
		Queue<Vertex> q = new LinkedList<>();
		bfs(value, q);
	}
	private void bfs(int value, Queue<Vertex> q) {
		arr.get(value-1).setVisited(true);
		q.add(arr.get(value-1));
		while(!q.isEmpty()) {
			for(Vertex a : graph.get(q.poll())) {
				if(!a.isVisited()) {
					a.setVisited(true);
					q.add(a);
				}
			}
		}
	}
	
	public boolean allVisited() {
		boolean all = true;
		for(int i = 0; i < arr.size(); i++) {
			if(!arr.get(i).isVisited()) {
				all = false;
				break;
			}
		}
		return all;
	}
}
