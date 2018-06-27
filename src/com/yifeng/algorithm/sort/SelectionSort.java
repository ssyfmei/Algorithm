package com.yifeng.algorithm.sort;

public class SelectionSort implements Sort{
	public void sort(int[] a) {
		for(int i = 0; i < a.length; i++) {
			int idx = i;
			for(int j = i + 1; j < a.length; j++) {
				if(a[idx] > a[j]) {
					idx = j;
				}
			}
			Util.exch(a, i, idx);
		}
	}
}
