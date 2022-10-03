package basicJava;

public class Student1 {
  int phone_no;
  int roll_no;
  String name;
  Student1(String name,int phone_no,int roll_no){ 
	  this.phone_no = phone_no;
	  this.roll_no = roll_no;
	  this.name = name;
	  
  }
  
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 std1 = new Student1("sam",123456789,21);
		Student1 std2 = new Student1("John",153456789,22);
		System.out.println("Student1 informtion");
		System.out.println(std1.name+ "  " +std1.phone_no+ "  " +std1.roll_no);
		System.out.println("Student2 informtion");
		System.out.println(std2.name+ "  " +std2.phone_no+ "  " +std2.roll_no);
	}

}
