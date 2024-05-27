/*
 * Total Marks SList Class: 26 Marks
 */
public class SList<T extends Comparable<T>> implements IList<T> {

	private Node<T> head = null;
	private Node<T> tail = null;
	private Integer size = 0;
	
	/**
	 * Default constructor
	 */
	public SList() {}
	
	/**
	 * returns the first node in the list.
	 */
	public Node<T> first() {
		return head;
	}
	
	/**
	 * returns the last node in the list.
	 */
	public Node<T> last() {
		return tail;
	}
	
	/**
	 * returns the node before a given node in the list.
	 * 3 marks
	 */
	@Override
	public Node<T> prev(Node<T> node) {
		//TODO: Complete
	}
	
	/**
	 * returns the next node after a given node in the list.
	 */
	@Override
	public Node<T> next(Node<T> node) {
		return node.getNext();
	}
	
	/**
	 * Replace the element of a given node in the list
	 * @return the old element of the given node
	 * 1 Marks
	 */
	@Override
	public T replace(Node<T> node, T item) {
		//TODO: Complete
	}
	
	/**
	 * Add an element after a given node in the list
	 * 3 Marks
	 */
	@Override
	public Node<T> insertAfter(Node<T> node, T item) {
		//TODO: Complete
	}

	/**
	 * Add an element before a given node in the list
	 * 5 Marks
	 */
	@Override
	public Node<T> insertBefore(Node<T> node, T item) {
		//TODO: Complete
	}

	/**
	 * Add an element to the start of the list
	 * @return the new node
	 */
	public Node<T> insertFirst(T item) {
		Node<T> newNode = new Node<T>(head, item);
		head = newNode;
		if (isEmpty())
			tail = head;
		size++;
		return newNode;	
	} 

	/**
	 * Add an element to the end of the list
	 * @return the new node
	 */
	public Node<T> insertLast(T item){
		Node<T> newest = new Node<T>(null, item);
		if (isEmpty())
		  head = newest;
		else
		  tail.setNext(newest);
		tail = newest;
		size++;
		return newest;
	}
	/*
	 * Alternate implementation (is actually wrong))
	public Node<T> addLast(T item){
		//TODO: Complete
		return addAfter(tail, item);
	}*/
	
	/**
	 * Remove a specified node from the list. The removed element is returned
	 * 5 Marks
	 */
	@Override
	public T remove(Node<T> node) {		
		//TODO: Complete
	}

	/**
	 * Returns the node that contains the element that is specified as a parameter
	 * 5 Marks
	 */
	@Override
	public Node<T> search(T elem) {
		//TODO: Complete
	}

	/**
	 * Returns true if the list is empty
	 */
	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * Return the size of the list
	 */
	@Override
	public Integer size() {
		return size;
	}
	
	/**
	 * The overridden method for displaying items in the Singly-Linked List
	 * format: <e1><-><e2><-><e3><->
	 * 4 Marks
	 */
	@Override
	public String toString() {
		String result = "";
		Node<T> currentNode = head;
		
		//TODO: Complete
		
		return result;
	}
}
