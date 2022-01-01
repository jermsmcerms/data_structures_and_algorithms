package binarytrees;

import dictionary.Dictionary;

public class BinarySearchTrees<Key extends Comparable<? super Key>, E>
implements Dictionary<Key, E> {
	private BSTNode<Key, E> root;
	private int nodeCount;
	
	public BinarySearchTrees() {
		root = null;
		nodeCount = 0;
	}
	@Override
	public void clear() {
		root = null;
		nodeCount = 0;
	}

	@Override
	public void insert(Key key, E element) {
		root = insert(root, key, element);
		nodeCount++;
	}

	@Override
	public E remove(Key key) {
		E temp = find(root, key);
		if(temp != null) {
			root = remove(root, key);
		}
		return temp;
	}

	@Override
	public E removeAny() {
		if(root != null) {
			E temp = root.getElement();
			root = remove(root, root.getKey());
			nodeCount--;
			return temp;
		}
		return null;
	}

	@Override
	public E find(Key key) {
		return find(root, key);
	}

	@Override
	public int size() {
		return nodeCount;
	}

	private BSTNode<Key, E> insert(BSTNode<Key, E> root, Key key, E element) {
		if(root != null) {
			if(root.getKey().compareTo(key) > 0) {
				root.setLeftChild(insert(root.getLeftChild(), key, element));
			} else {
				root.setRightChild(insert(root.getRightChild(), key, element));
			}
		}
		return root;
	}
	
	private E find(BSTNode<Key, E> root, Key key) {
		if(root != null) {
			if(root.getKey().compareTo(key) > 0) {
				return find(root.getLeftChild(), key);
			}
			
			if(root.getKey().compareTo(key) == 0) {
				return root.getElement();
			}
			
			return find(root.getRightChild(), key);
		}
		return null;
	}

	private BSTNode<Key, E> remove(BSTNode<Key, E> root2, Key key) {
		// TODO Auto-generated method stub
		return null;
	}
}
