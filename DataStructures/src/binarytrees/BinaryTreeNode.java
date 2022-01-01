package binarytrees;

public interface BinaryTreeNode<E> {
	public E getElement();
	public void setElement(E element);
	public BinaryTreeNode<E> getLeftChild();
	public BinaryTreeNode<E> getRightChild();
	public boolean isLeaf();
}
