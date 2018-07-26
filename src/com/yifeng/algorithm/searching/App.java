package com.yifeng.algorithm.searching;

import java.util.Random;

public class App {
	public static void main(String[] args) {
		RedBlackBST<Integer, String> map = new RedBlackBST<>();
		
		Random random = new Random();
		
		for(int i = 0; i < 10; i++) {
			int item = random.nextInt(10);
			System.out.println(item);
			map.put(i, Integer.toString(item));
		}
		System.out.println(map.height());
	}
}
