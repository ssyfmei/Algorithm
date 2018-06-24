package com.yifeng.algorithm.graph;

import java.util.ArrayDeque;
import java.util.Deque;

public class TopologicalOrder {
	boolean[] marked;
	boolean[] onStack;
	Deque<Integer> order;
	boolean hasCycle;
	
	public TopologicalOrder(DGraph graph) {
		marked = new boolean[graph.V()];
		onStack= new boolean[graph.V()];
		order  = new ArrayDeque<>();
		for(int v = 0; v < graph.V(); v++) {
			if(!marked[v]) {
				dfs(v, graph);
			} 
		}
	}
	private void dfs(int v, DGraph graph) {
		marked[v] = true;
		for(int w: graph.adj(v)) {
			if(hasCycle) {
				return;
			} else if(!marked[w]) {
				dfs(w, graph);
			} else if(onStack[w]) {
				order    = null;
				hasCycle = true;
			}
		}
		order.addFirst(v);
	}
}
