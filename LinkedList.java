public class LinkedList<T> implements LinkedListInterface<T> {

	private Node<T> head; // head node, entry point to the entire Linked List
	private int size; // number of items stored in the Linked List

	// replaces the current head node
	public void newHead(T item) {
		head = new Node<T>(item, head);
		size++;
	}

	// returns true if objects exists in the Linked List, false otherwise
	public boolean contains(T item) {
		// TODO
		if(item == null) { //check if item is null
			System.out.println("Item is null, unable to check if linked list contains the item.");
			return false;
		}
		Node<T> temp = head; //set temporary head
		while(temp != null) {
			if(temp.getItem().equals(item)) {
				return true;
		  }
		temp = temp.getNext();
  	}
		return false;
	}

	public T getItem(T item) {
		// TODO
		if(item == null) { //check if item is null
			System.out.println("Item is null, unable to check if linked list contains the item.");
			return item;
		}
		Node<T> temp = head;
		while(temp != null) {
			if(temp.getItem().equals(item)) {
				return temp.getItem();
			}
			temp = temp.getNext();
		}
		return null;
	}

	public void print() {
		if(head == null) {
			System.out.println("linked list is empty");
			return;
		}
		else {
			Node<T> temp = head;
			while(temp != null) {
				System.out.print(temp.getItem().toString() + " -> ");
				temp = temp.getNext();
			}
			System.out.println("null");
		}
	}

}
