package Teckarch.Day8;

public class MyList {

public MyNode head=null;



public void addFront(int ele) {
	MyNode nd = new MyNode(ele);
	System.out.println("Adding:"+ele);
	if (head == null) 
		head = nd;
	else {
		nd.link= head;
		head =nd;
	}
}
public void deleteFront() {
	if (head ==null)
		System.out.println("list is empty");
	else {
		System.out.println("Elemeent deleted is :"+head.value);
		head =head.link;
	}
}
public void traverse() {
	System.out.println("list Conetent is ...............");
	MyNode temp = head;
	while (temp !=null) {
		System.out.println(temp.value);
		temp =temp.link;
	}
	System.out.println("....................");
}
	public static void main(String[] args) {
		MyList l = new MyList();
		l.addFront(3);
		l.addFront(4);
		l.addFront(3);
		l.addFront(8);
		l.traverse();
		l.deleteFront();
		l.deleteFront();
		l.deleteFront();
		l.deleteFront();
		l.deleteFront();
		l.traverse();
		

	}

}
