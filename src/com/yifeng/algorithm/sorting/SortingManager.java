package com.yifeng.algorithm.sorting;

public class SortingManager {
	public static Sort generate(String str) {
		if(str.equals("BubbleSort")) {
			return new BubbleSort();
		} else if(str.equals("SelectionSort")) {
			return new SelectionSort();
		} else if(str.equals("InsertionSort")) {
			return new InsertionSort();
		} else if(str.equals("ShellSort")) {
			return new ShellSort();
		} else if(str.equals("MergeSort")) {
			return new MergeSort();
		} else if(str.equals("MergeSortBU")){
			return new MergeSortBU();
		} else {
			throw new IllegalArgumentException("Unknown Sorting Method");
		}
	}
}
