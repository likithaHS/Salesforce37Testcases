package basicJava;

public class SwapNoTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x=10,y=5;
        System.out.println("Before swap value of x " +x+ " and y "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swap value of x " +x+ " and y "+y);
        
	}

}
