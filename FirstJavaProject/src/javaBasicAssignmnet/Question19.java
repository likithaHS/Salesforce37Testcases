package javaBasicAssignmnet;

public class Question19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int area =  areaOfRectangle(3,4);
		int perimeter = perimeterOfRectangle(3,4);
		System.out.println("Area of rectangle is :"+area);
		System.out.println("perimeter of rectangle is :"+perimeter);
		
	}
	public static int areaOfRectangle(int w, int h) {
		int area = w*h;
		return area;
	}
	public static int perimeterOfRectangle(int w, int h) {
		int perimeter =(2*(w+h));
		return perimeter;
	}

}
