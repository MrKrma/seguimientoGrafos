package main;

import java.util.ArrayList;
import java.util.Scanner;
import model.Controller;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	private static Controller control = new Controller();
	
	public static void main(String[] args) {
		System.out.println("Escribir el valor del primer vertice");
		int a = addNewVertex();
		control.addVertex(a);
		System.out.println("Escribir el valor del segundo vertice");
		int b = addNewVertex();
		control.addVertex(b);
		System.out.println("Escribir el valor del tercero vertice");
		int c = addNewVertex();
		control.addVertex(c);
		System.out.println("Escribir el valor del cuarto vertice");
		int d = addNewVertex();
		control.addVertex(d);
		System.out.println("Escribir el valor del ultimo vertice");
		int e = addNewVertex();
		control.addVertex(e);
		
		ArrayList<Integer> ai = new ArrayList<>();
		ai.add(1);
		control.addNext( a, ai);
		ArrayList<Integer> bi = new ArrayList<>();
		bi.add(2);
		control.addNext( b, bi);
		ArrayList<Integer> ci = new ArrayList<>();
		ci.add(3);
		ci.add(4);
		control.addNext( c, ci);
		ArrayList<Integer> di = new ArrayList<>();
		di.add(0);
		control.addNext( d, di);
		ArrayList<Integer> ei = new ArrayList<>();
		ei.add(2);
		control.addNext( e, ei);
		
		//dfs(d);
		bfs(a);
		
		if(control.allVisited()) {
			System.out.println("fuerte");
		}else {
			System.out.println("no lo es");
		}
	}
	
	public static int addNewVertex() {
		return sc.nextInt();
	}
	
	public static void dfs(int value) {
		control.dfs(value);
	}
	
	public static void bfs(int value) {
		control.bfs(value);
	}
}

