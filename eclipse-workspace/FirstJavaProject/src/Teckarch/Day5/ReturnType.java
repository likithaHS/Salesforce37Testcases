package Teckarch.Day5;

class Pavan {}

class Parent{
	
	public Parent fun() {
		Child c = new Child();

		System.out.println(c.getClass().getSimpleName());
		return c;
	}
}
class Child extends Parent{
	
	@Override
	public Parent fun() {
		Parent p = new Parent();
		System.out.println(p.getClass().getSimpleName());
		return p;
	}
}


public class ReturnType {

	public static void main(String[] args) {
		
		Parent p1 = new Parent();
		p1.fun();
		
		

	}

}
