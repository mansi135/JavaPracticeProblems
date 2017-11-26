package arrayBasedQ;

class Queue {
	
	public int[] arrayQ ;
	public int capacity ;
	private int size ;
	private int enqueue ;
	private int dequeue ;
	
	public Queue(int capacity) {
		this.capacity = capacity;
		this.arrayQ = new int[capacity];
		this.enqueue = 0;
		this.dequeue = 0;
	}
	
	public void add(int value) {
		if ((enqueue - dequeue) == capacity) {
			System.out.println("Queue already full , cant add more items");
		} else {
			arrayQ[enqueue % capacity] = value;
			enqueue++;
		}
		
	}
	
	public int delete() {
		if (dequeue == enqueue) {
			System.out.println("Queue already empty!!");
			return -1;
		} else {
			int value = arrayQ[dequeue % capacity];
			arrayQ[dequeue % capacity] = 0;
			dequeue++;			
			return value;
		}
		
	}
	
	
	public void print() {
		for (int i = 0; i < capacity; i++) {
			System.out.print(arrayQ[i] + " ");
		}
		System.out.println();
	}
	
	public int size() {
		return enqueue-dequeue;
	}
	
}

public class ArrayBasedCircularQ {

	public static void main(String[] args) {

		Queue q = new Queue(5);
		
		q.add(3);
		q.add(4);
		q.add(5);
		System.out.println(q.size());

		q.add(6);
		q.add(7);
		
		q.print();

		q.add(8);
		System.out.println(q.size());
		
		q.print();
		
		q.delete();
		q.delete();
		q.delete();
		System.out.println(q.size());

		q.delete();
		q.delete();

		q.print();
		System.out.println(q.size());

		
		q.delete();
		q.delete();
		
		System.out.println(q.size());


		
		
	}

}
