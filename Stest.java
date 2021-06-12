package Lab2;
class Student {
	String name, city;
	int age;
	static int m;
	void printData() {
		System.out.println("Name: "+name);
		System.out.println("City: "+city);
		System.out.println("Age: "+age);
	}
}
public class Stest {
	public static void main(String[] args) {
Student s1 = new Student();
Student s2 = new Student();
s1.name = "Jeet";
s1.city = "Navi Mumbai";
s1.age = 20;
s2.name = "Jeetkumar";
s2.city = "Mumbai";
s2.age = 21;
s2.printData();
s1.printData();
s1.m = 18;
s2.m = 19;
Student.m = 25;
System.out.println("s1.m = "+s1.m);
System.out.println("s2.m = "+s2.m);
System.out.println("Student.m = "+Student.m);
}
}