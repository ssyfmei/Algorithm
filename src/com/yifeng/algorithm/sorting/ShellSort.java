package com.yifeng.algorithm.sorting;

public class ShellSort implements Sort{
	public  void sort(int[] a) {
		int n = a.length;
		int h = 1;
		while(h < n / 3) h = 3 * h + 1;
		while(h > 0) {
			for(int i = h; i < n; i += h) {
				int idx = i;
				int tmp = a[i];
				while(idx > 0 && a[idx - h] > tmp) {
					a[idx] = a[idx - h];
					idx = idx - h;
				}
				a[idx] = tmp;
			}			
			h = h / 3;
		}
	}
}
