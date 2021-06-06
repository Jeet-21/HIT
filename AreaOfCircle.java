package Lab1;
import java.util.Scanner;
public class AreaOfCircle {
	public static void main(String[] args) {
		double radius, area, circumference;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius of Circle: ");
		radius = sc.nextDouble();
		area = Math.PI * (radius * radius);
		System.out.println("Area of Cicle: " +area);
		circumference = 2 * Math.PI * radius;
		System.out.println("Circumference of Circle: " +circumference);
	}
}
