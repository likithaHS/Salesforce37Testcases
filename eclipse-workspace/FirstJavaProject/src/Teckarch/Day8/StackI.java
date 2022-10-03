package Teckarch.Day8;



public class StackI {
	private int size;
	private int[] a;
	private int top;
	
	public StackI(int n) {
		size = n;
		a = new int[size];
		top = -1;
		
	}
	public boolean isFull() {
		return top == size-1;
	}
	public boolean isEmpty() {
		return top == -1;
	}
	public int peek() {
		return a[top];
	}
	public void push(int ele) {
		if(isFull()) {
			System.out.println("Stack is full");
		}
		else
		{
			top++;
			a[top]= ele;
			System.out.println("Item has been inserted");
			
		}
		}
	public int pop() {
		int delete = -1;
		if (isEmpty()) {
			System.out.println("The Stack is empty ");
		}
		else {
			delete= a[top];
			top--;
		}
		return delete;
	}
	
	public void display() {
		System.out.println("Content of the stack is:");
		int temp = top;
		while (temp >-1) {
			System.out.println(a[temp]);
			temp--;
		}
	}

	public static void main(String[] args) {
		
		StackI s = new StackI(5);
		s.push(3);
		s.push(6);
		s.push(7);
		s.push(4);
		s.push(1);
		s.push(8);
		s.display();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.display();
	}

}
