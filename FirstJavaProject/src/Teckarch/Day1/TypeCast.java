package Teckarch.Day1;

public class TypeCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float d =1234.56f;
		double e = 1234.56005859375;
		double myDouble = d;
		System.out.println("float " +d+ " to double " +myDouble);
		 float myFloat= (float) e;
		System.out.println("double " +e+ " to float " +myFloat);

	}

}
