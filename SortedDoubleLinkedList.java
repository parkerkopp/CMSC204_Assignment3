import java.util.*;

public class SortedDoubleLinkedList<T> extends BasicDoubleLinkedList<T>{
	
	private Comparator<T> comparator;
	
	SortedDoubleLinkedList(Comparator<T> comparableObject){
		
		comparator = comparableObject;
		
	}
	
	public void add(T data) {
		
		Node toAdd;
		Node currentNode = head;
		
		for(int i = 0; i < size; i++) {
			
			if(comparator.compare(currentNode.getData(), data) >= 0) {
				
				if(i == 0) {
					
					toAdd = new Node(data, null, currentNode);
					head = toAdd;
					
				}
				
				else {
					
					toAdd = new Node(data, currentNode.getPrev(), currentNode);
					currentNode.getPrev().setNext(toAdd);
					
				}
				
				currentNode.setPrev(toAdd);
				size++;
				return;
				
			}
			
			currentNode = currentNode.getNext();
			
		}
		
		super.addToEnd(data);
		
	}
	
	public ListIterator<T> iterator(){
		
		return super.iterator();
		
	}
	
	public Node remove(T data, Comparator<T> comparator) {
		
		return super.remove(data, comparator);
		
	}
	
	public void addToEnd(T data) throws UnsupportedOperationException {
		
		throw new UnsupportedOperationException("This operation is unsupported");
		
	}
	
	public void addToFront(T data) throws UnsupportedOperationException {
		
		throw new UnsupportedOperationException("This operation is unsupported");
		
	}
	
}