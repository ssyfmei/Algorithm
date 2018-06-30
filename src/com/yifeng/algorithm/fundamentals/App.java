package com.yifeng.algorithm.fundamentals;

import java.util.Iterator;

public class App {
	public static void main(String[] args) {
		ArrayStack<Integer>arrayStack = new ArrayStack<>();
		
		for(int i = 0 ; i < 30; i++) {
			arrayStack.push(i);
		}
		
		Iterator<Integer> iterator = arrayStack.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		for(int i = 0 ; i < 30; i++) {
			arrayStack.pop();
		}
		System.out.println(arrayStack.size());
	}
}
