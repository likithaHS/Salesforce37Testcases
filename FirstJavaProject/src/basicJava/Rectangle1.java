package basicJava;

public class Rectangle1 {
	int w,l;
	Rectangle1 (int w, int l) 
	{
		this.w = w;
		this.l = l;
		
	}
	
	int area (int w, int l)
	{
		int result = w*l;
		return result;
		
	}

	public static void main(String[] args) {
		
		Rectangle1 r1 = new Rectangle1(4,5);
		int area1 = r1.area(r1.w, r1.l);
		System.out.println("the area of rectangle1 is : "+area1);
		Rectangle1 r2 = new Rectangle1(5,8);
		int area2 = r2.area(r2.w, r2.l);
		System.out.println("the area of rectangle2 is : "+area2);
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
