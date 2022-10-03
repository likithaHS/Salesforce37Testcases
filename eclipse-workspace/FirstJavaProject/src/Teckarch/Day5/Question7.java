package Teckarch.Day5;

class A{
	public void fun() {
		add(1,2);
	}
	public int add(int a,int b) {
		int sum = a+b;
		System.out.println("class A");
		return sum;
		
	}
}
class B extends A{
  @Override
	public int add(int a,int b) {
		 System.out.println(" Class B");
		 return 0;
	 }
	
}

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		a.fun();
		B b = new B();
		b.add(1,2);

	}

}
