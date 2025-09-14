public interface LinkedListInterface<T> {
	
	// this is all you need, but feel free to add more methods if needed.
	
	// add stuff to the list
	public void newHead(T item);
	
	// returns true if objects exists in the Linked List, false otherwise
	public boolean contains(T item);
	
	// if provided object matches an item in the list, then return the item from the list back to the user
	public T getItem(T item);
	
	// print all items in the list
	public void print();
}