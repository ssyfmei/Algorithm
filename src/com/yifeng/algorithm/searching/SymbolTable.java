package com.yifeng.algorithm.searching;


public interface SymbolTable<Key, Value> {
	void put(Key key, Value value);
	Value get(Key key);
	void delete(Key key);
	boolean containsKey(Key key);
	boolean isEmpty();
	int size();
	Iterable<Key> keys(); 
}
