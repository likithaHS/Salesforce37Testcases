package basicJava;
import java.util.Scanner;

public class MncCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int temp = 0 ;
		int revised_salary = 0;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter employee old salary is :");
		int old_salary =sc.nextInt();
		System.out.println("Enter employee yaers of experence :");
		int exp = sc.nextInt();
		System.out.println("Enter the reward:");
		boolean reward = sc.nextBoolean();
		
		if (exp >=3 && exp <=5){
			revised_salary =  old_salary + ((old_salary *10)/100);
			System.out.println("Revised salary is :" +revised_salary);
			} else if (exp >=6 && exp <=9){
				revised_salary =  old_salary + ((old_salary *15)/100);
				System.out.println("Revised salary is :" +revised_salary);
				}else if (exp >=10 && exp <=20){
					revised_salary =  old_salary + ((old_salary *20)/100);
					System.out.println("Revised salary is :" +revised_salary);
					}else {
						revised_salary =  old_salary + ((old_salary *25)/100);
						System.out.println("Revised salary is :" +revised_salary);
					}
		
		if (reward){
			revised_salary += 1000;
			System.out.println("salary after reward is :" +revised_salary);
			
		}
		
		sc.close();

	}

}
