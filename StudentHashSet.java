import java.util.*;

public class StudentHashSet {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Set<Student> student = new HashSet<Student>();
		Student st1 = new Student(1,"Abhijeet","Banglore");
		Student st2 = new Student(2,"Prashant","Punjab");
		Student st3 = new Student(3,"Ajit","Pune");
		Student st4 = new Student(4,"Sunny Leone","Mumbai");
		Student st5 = new Student(5,"Mia Khalifa","USA");
		student.add(st1);
		student.add(st2);
		student.add(st3);
		student.add(st4);
		student.add(st5);

		// // add method
		Student obj = new Student();
		//obj.AddStudent(student);
		
		// Student obj1 = new Student();
		// obj1.RemoveStudent(student);
		// 	System.out.println("Enter the details");
		// 	int id = sc.nextInt();
		// String name = sc.next();
		// String city= sc.next();
		// Student st7 = new Student(id,name,city);
		// student.add(st7);
		
		System.out.println("\nEnter Student ID to remove");
		// int id = sc.nextInt();
		// String name = sc.nextLine();
		// String city= sc.nextLine();
		Student rm = new Student(3,"Ajit","Pune");
		//Student rm = new Student(id);
		student.remove(rm);
		



		// Display Elements in hashset
		for (Student i:student ) {
			System.out.println(i.id+" "+i.name+" "+i.city);
		}
	}
}

class Student {
	int id;
	String name;
	String city;
	Scanner sc = new Scanner(System.in);

	Student()
	{

	}

	Student(int id){
		this.id = id;
	}

	Student(int id, String name, String city)
	{
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public Object AddStudent(Set<Student> student){
		System.out.println("*** Enter Employee Details ***");
		int id = sc.nextInt();
		String name = sc.next();
		String city = sc.next();
		Student st7 = new Student(id,name,city);
		return student.add(st7);
	}

	// public Object RemoveStudent(Set<Student> student){
	// 	System.out.println("\nEnter Student ID to remove");
	// 	int id = sc.nextInt();
	// 	Student rm = new Student(id);
	// 	student.remove(rm);
	// 	return null;
	// }
}