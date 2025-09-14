public class Node<T> {
	
	private T item; // data = item (same thing)
	private Node<T> next; // reference or link to the next Node
	
	// constructor #1
	public Node(T item) {
		this.item = item;
		next = null;
	}
	
	// constructor #2
	public Node(T item, Node<T> next) {
		this.item = item;
		this.next = next;
	}
	
	// getters
	public T getItem() { return item; }
	public Node<T> getNext() { return next; }
	
	// setters
	public void setItem(T item) { this.item = item; }
	public void setNext(Node<T> next) { this.next = next; }

}