package singlyLinkedList;

public class ImplementSinglyLinkedList {
	Node first = null;
	Node last = null; 
	int size = 0;
	
	
	public void addFirst(int data) {		
		Node temp = new Node();
		temp.data = data;
		if( size == 0) {
			last = temp ;
		} else {
			temp.next = first;
		}		
		first = temp;		
		size++ ;
	}
	
	
	public void addLast(int data) {
		Node temp = new Node();
		temp.data = data;
		if( size == 0) {
			first = temp ;
		} else {
			last.next = temp;
		}		
		last = temp;		
		size++ ;
	}
	
	
	public void removeFirst() {
		if(size == 0) {
			System.out.println("Already Empty List\n");
		} else if (first == last){
			last = null; 
			first = null; 
			size--;			
		} else {
			first = first.next;
			size-- ;
		}
	}
	
	
	public void removeLast() {
		if(size == 0) {
			System.out.println("Already Empty List\n");
		} else if (first == last){
			last = null; 
			first = null; 
			size--;			
		} else {
			Node temp = first;
			while(temp.next != last) {
				temp = temp.next;
			}
			temp.next = null;
			last = temp;
			size-- ;
		}	
	}
	
	
	public void traverse() {
		Node temp = first;
		if(temp == null) {
			System.out.print("Empty List");
		} else {
			while(temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		}
		System.out.println("\nSize= " + size + "\n");
	}
	
	
}
