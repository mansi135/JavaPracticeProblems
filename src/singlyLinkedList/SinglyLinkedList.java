package singlyLinkedList;

public class SinglyLinkedList {

	public static void main(String[] args) {
		
		ImplementSinglyLinkedList list = new ImplementSinglyLinkedList();
		list.removeLast();
		list.removeFirst();
		list.traverse();
		list.addFirst(4);
		list.traverse();
		list.removeLast();
		list.traverse();
		list.addLast(3);
		list.addLast(2);
		list.addLast(1);
		list.addFirst(0);
		list.addFirst(5);
		list.traverse();
		list.removeLast();
		list.removeLast();
		list.removeFirst();
		list.traverse();
		list.removeFirst();
		list.traverse();
		list.removeLast();
		list.traverse();
		list.removeFirst();
		list.traverse();

	}

}
