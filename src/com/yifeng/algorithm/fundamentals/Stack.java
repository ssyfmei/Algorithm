package com.yifeng.algorithm.fundamentals;

public interface Stack<Item> {
	public Item pop();
	public void push(Item item);
	public int  size();
	public boolean isEmpty();
}
