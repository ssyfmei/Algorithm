package com.yifeng.algorithm.searching;

import java.util.NoSuchElementException;

public class RedBlackBST<K extends Comparable<K>, V>  implements OrderedSymbolTable<K, V> {
	private static final boolean RED   = false;
    private static final boolean BLACK = true;
    
    private final Entry<K, V> nil;
    private Entry<K, V> root;
    private int size;
    static final boolean valEquals(Object o1, Object o2) {
        return (o1==null ? o2==null : o1.equals(o2));
    }
    
    public RedBlackBST() {
    	this.size = 0;
    	this.root = null;
    	this.nil  = new Entry<K,V>(null, null, null,BLACK);
    }
    
    static final class Entry<K,V> implements MapEntry<K,V> {
        K key;
        V value;
        Entry<K,V> left;
        Entry<K,V> right;
        Entry<K,V> parent;
        boolean color = BLACK;
        
        Entry(K key, V value, Entry<K,V> parent, boolean color) {
            this.key = key;
            this.value = value;
            this.parent = parent;
            this.color  = color;
        }
        
        public K getKey() {return key;}
        public V getValue() {return value;}
        
        public V setValue(V value) {
            V oldValue = this.value;
            this.value = value;
            return oldValue;
        }

        public boolean equals(Object o){
            if (!(o instanceof Entry))
                return false;
            Entry<?,?> e = (Entry<?,?>)o;
            return valEquals(key,e.getKey()) && valEquals(value,e.getValue());
        }

        public int hashCode() {
            int keyHash = (key==null ? 0 : key.hashCode());
            int valueHash = (value==null ? 0 : value.hashCode());
            return keyHash ^ valueHash;
        }

    }
    public final Entry<K, V> getFirst() {
    	Entry<K,V> q = root;
    	if(q != null) {
    		while(q.left != null) {
    			q = q.left;
    		}
    	}
    	return q;
    }
    public final MapEntry<K, V> getLast(){
    	Entry<K,V> q = root;
    	if(q != null) {
    		while(q.right != null) {
    			q = q.right;
    		}
    	}
    	return q;
    }
    
    
	@Override
	public void put(K key, V value) {
		put(key, value, root, this.nil);
	}
	private void put(K key, V value, Entry<K,V> node, Entry<K,V> parent) {
		
	}
	private Entry<K, V> anotherChild(Entry<K, V> father, Entry<K, V> child) {
		if(father.left == child) return father.right;
		else return father.left;
	}
	private void flipColor(Entry<K, V> node) {
		if(node.color==RED) node.color = BLACK;
		else node.color = RED;
	}
	
	private void leftRotate(Entry<K, V> p) {
		if(p != null && p.right != null) {
			Entry<K,V> right = p.right;
			p.right = right.left;
			right.left = p;
		}
	};
	private void rightRotate(Entry<K, V> p) {
		if(p != null && p.left != null) {
			Entry<K, V> left = p.left;
			p.left = left.right;
			left.right = p;
		}
	};
	
	private void adjust(Entry<K, V> node) {
		if(node.parent.color == BLACK) { return;}
		Entry<K, V> gFather = node.parent.parent;
		Entry<K, V> uncle = anotherChild(gFather, node.parent);
		if(uncle.color == RED) {
			flipColor(uncle);
			flipColor(gFather);
			flipColor(node.parent);
			adjust(node.parent);
		} else {
			
			
		}
	}
	
	@Override
	public void delete(K key) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public V get(K key) {
		return get(key, root);
	}
	
	private V get(K key, Entry<K, V> node){
		if(valEquals(node, nil)) {
			throw new NoSuchElementException("the given key doesn't exist");
		}
		else if(key.compareTo(node.key) < 0) {
			return get(key, node.left);
		}
		else if(key.compareTo(node.key) > 0) {
			return get(key, node.right);
		}
		else {
			return node.getValue();
		}
	}
	
	@Override
	public boolean containsKey(K key) {
		return containsKey(key, root);
	}
	
	private boolean containsKey(K key, Entry<K, V> node) {
		if(valEquals(node, nil)) {
			return false;
		} else if(node.key.compareTo(key)==0) {
			return true;
		} else if(node.key.compareTo(key)>0) {
			return containsKey(key, node.right);
		} else {
			return containsKey(key, node.left);
		}
	}

	@Override
	public boolean isEmpty() {
		return root == null;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public K min() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public K max() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public K floor(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public K ceiling(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int rank(K key) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public K select(int k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<K> keys(K lo, K hi) {
		// TODO Auto-generated method stub
		return null;
	}

}
