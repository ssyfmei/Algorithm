package com.yifeng.algorithm.fundamentals;

public interface Queue<Item> {
	public Item dequeue();
	public void enqueue(Item item);
	public int  size();
	public boolean isEmpty();
}
