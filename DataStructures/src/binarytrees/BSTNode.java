package binarytrees;
public class BSTNode<Key, E> implements BinaryTreeNode<E> {
	private Key key;
	private E element;
	private BSTNode<Key, E> leftChild;
	private BSTNode<Key, E> rightChild;
	
	public BSTNode() {
		leftChild = rightChild = null;
	}
	
	public BSTNode(Key key, E element) {
		this();
		this.key = key;
		this.element = element;
	}
	
	public BSTNode(Key key, E element, BSTNode<Key, E> leftChild, BSTNode<Key, E> rightChild) {
		this.key = key;
		this.element = element;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}
	
	public Key getKey() {
		return key;
	}
	
	public void setKey(Key key) {
		this.key = key;
	}
	
	public void setLeftChild(BSTNode<Key, E> newChild) {
		this.leftChild = newChild;
	}
	
	public void setRightChild(BSTNode<Key, E> newChild) {
		this.rightChild = newChild;
	}
	
	@Override
	public E getElement() {
		return element;
	}

	@Override
	public void setElement(E element) {
		this.element = element;		
	}

	@Override
	public BSTNode<Key, E> getLeftChild() {
		return leftChild;
	}

	@Override
	public BSTNode<Key, E> getRightChild() {
		return rightChild;
	}

	@Override
	public boolean isLeaf() {
		// TODO Auto-generated method stub
		return leftChild == null & rightChild == null;
	}

}
