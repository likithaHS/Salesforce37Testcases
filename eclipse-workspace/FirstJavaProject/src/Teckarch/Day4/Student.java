package Teckarch.Day4;

public class Student {
	String name;
	int ID;
	int marks1;
	int marks2;
	int marks3;
	Student(String name,int ID,int marks1,int marks2,int marks3){
		this.name = name;
		this.ID= ID;
		this.marks1= marks1;
	    this.marks2= marks2;
		this.marks3= marks3;
		
	}
	public void display() {
		System.out.println("Name:"+this.name);
		System.out.println("ID:"+this.ID);
		System.out.println("marks1:"+this.marks1);
		System.out.println("marks2:"+this.marks2);
		System.out.println("marks3:"+this.marks3);
		
	}

	public static void main(String[] args) {
		Student st[] = new Student[5];
		 st[0] = new Student("abc",123,10,20,30);
	st[1] = new Student("edg",456,40,50,60);
    st[2] = new Student("hij",789,70,80,90);
	st[3] = new Student("klm",123,10,20,30);
	st[4] = new Student("nop",456,20,30,40);
	
	for( int i =0;i<st.length;i++) {
		int j =i+1;
		System.out.println("student"+j);
		st[i].display();
		System.out.println();
	}
		
		
    

	}

}
