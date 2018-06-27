package com.yifeng.algorithm.sorting;

public class InsertionSort implements Sort {
	public void sort(int[] a) 
	{
		for(int i = 1; i < a.length; i++) {
			int tmp = a[i];
			int idx = i;
			while(idx > 0 && a[idx - 1] > tmp) {
				a[idx] = a[idx - 1];
				idx--;
			}
			a[idx]=tmp;
		}
	}
}
