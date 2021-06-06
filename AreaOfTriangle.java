package Lab1;
import java.util.Scanner;
public class AreaOfTriangle {
	public static void main(String[] args) {
		double base, height, area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base of Triangle: ");
		base = sc.nextDouble();
		System.out.println("Enter the Height of Triangle: ");
		height = sc.nextDouble();
		area = (base * height) / 2;
		System.out.println("Area of Triangle: " +area);
	}
}
