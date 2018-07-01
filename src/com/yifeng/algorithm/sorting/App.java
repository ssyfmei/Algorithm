package com.yifeng.algorithm.sorting;

public class App {

	public static void main(String[] args) {
		
		Sort method = SortingManager.generate("QuickSort");
		int[] test1 = new int[] {9, 13, 15, 4, 5, 1, 2, 14, 8, 11, 19, 6, 17, 7, 10, 3, 16, 18, 12,
				9, 13, 15, 11, 19, 6, 17, 7, 10, 3, 16, 18, 12,
				9, 13, 15, 4, 5, 1, 2, 14,9, 13, 15, 11, 19, 6, 17, 7, 10, 3, 16, 18, 12,
				9, 13, 15, 4, 5, 1, 2, 14, 8, 11, 19, 6, 17, 7, 10, 3, 16, 18, 12};
		Util.shuffle(test1);
		method.sort(test1);
		for(int item: test1) {System.out.print(item);}
	}
}
