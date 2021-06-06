package Lab1;
import java.util.Scanner;
public class AreaOfRectangle {
	public static void main(String[] args) {
	double length, breadth, area;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Length of Rectangle: ");
	length = sc.nextDouble();
	System.out.println("Enter the Breadth of Rectangle: ");
	breadth = sc.nextDouble();
	
	area = length * breadth;
	System.out.println("Area of Rectangle: " +area);
	}
}
