package Graphs;

import java.util.Queue;

public class GraphTester {

	public static void main(String[] args) {
		WeightedGraph<String> graph = new WeightedGraph();
		graph.addVertex("Houston");
		graph.addVertex("Dallas");
		graph.addVertex("Denver");
		
		graph.addEdge("Denver", "Houston", 300);
		graph.addEdge("Denver", "Dallas", 200);
		
		Queue<String> q = graph.getToVertices("Denver");
		System.out.println(q);
		
		
		

	}

}
