package Teckarch.Day8;

public class MyQueue {
	private int size;
	private int[] a;
	private int rare;
	private int front;
	private int currentsize;
	
	public MyQueue(int n) {
	 size = n;
	 a = new int[size];
	 front =0;
	 rare =-1;
	 currentsize = 0;
		
	}
	
	public boolean isEmpty() {
		if (currentsize == 0)
			return true;
		else
			return false;
	}
	public boolean isFull() {
		if (currentsize == size)
			return true;
		else
			return false;
	}
	public void enqueue(int ele) {
		if(isFull()) {
			System.out.println("Queue is full");
		}
		else
		{
			rare++;
			a[rare]=ele;
			//System.out.println("Element insterted into the queue");
			currentsize++;	
		}
	}
	
	public int dequeue() {
		int delete = -1;
		if(isEmpty()) {
			System.out.println("The queue is empty. Cannot delete");
		}
		else
		{
			delete= a[front];
			front++;
			currentsize--;
		}
		return delete;
	}
	public void display() {
		System.out.println("Content of the queue is:");
		//int rear;
		for (int i =front;i<=rare;i++)
		System.out.println(a[i]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue q= new MyQueue(3);
		q.enqueue(3);
		q.enqueue(1);
		q.enqueue(4);
		q.enqueue(8);
		q.display();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.display();
	
	}

}
