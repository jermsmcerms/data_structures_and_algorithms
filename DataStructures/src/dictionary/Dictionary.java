package dictionary;

public interface Dictionary<Key, E> {
	public void clear();
	public void insert(Key key, E element);
	public E remove(Key key);
	public E removeAny();
	public E find(Key key);
	public int size();
}
