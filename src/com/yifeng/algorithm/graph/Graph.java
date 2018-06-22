package com.yifeng.algorithm.graph;

public interface Graph {
	public void addEdge(int v, int w);
	public Iterable<Integer> adj(int v);
}