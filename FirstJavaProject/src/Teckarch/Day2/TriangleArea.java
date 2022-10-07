package Teckarch.Day2;

public class TriangleArea {
  public static float area (float b,float h) {
	  float a = (b*h)/2;
	  return a;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    float b = 4;
		float h = 7;
		float a = area(b,h);
		System.out.println("Area of tringale:"+a);
	}

}
