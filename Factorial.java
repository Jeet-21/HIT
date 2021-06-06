package Lab1;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		int num, factorial;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Number: ");
		num = sc.nextInt();
		factorial = fact(num);
		System.out.println("Factorial is: " +factorial);
	}
	static int fact (int n)
	{
		int output;
		if (n == 1) {
			return 1;
		}
		output = fact (n - 1) * n;
		return output;
	}
}
