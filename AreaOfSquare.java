package Lab1;
import java.util.Scanner;
public class AreaOfSquare {
	public static void main(String[] args) {
		double side, area;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Side of Square: ");
		side = sc.nextDouble();
		area = side * side;
		System.out.println("Area of Square: " +area);
		
	}
}
