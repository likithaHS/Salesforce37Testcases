package basicJava;

public class Triangle {
	int a,b,c;
	Triangle (){}
	
	int peremeter(int a,int b, int c ) {
		int result = a+b+c;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle tri = new Triangle ();
		tri.a = 3;
		tri.b = 4;
		tri.c = 5;
		int peri = tri.peremeter(tri.a,tri.b,tri.c);
		System.out.println("peremeter of triangle is :" +peri);
		
		
		

	}

}
