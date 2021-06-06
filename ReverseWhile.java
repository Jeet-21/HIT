package Lab1;
import java.util.Scanner;
public class ReverseWhile {
public static void main(String[] args) {
	int num = 0;
	int reverseno = 0;
	System.out.println("Enter the number to be reversed: ");
	Scanner in = new Scanner(System.in);
	num = in.nextInt();
	
	while (num != 0)
	{
		reverseno = reverseno * 10;
		reverseno = reverseno + num%10;
		num = num/10;
	}
	System.out.println("Reverse of Number is: "+reverseno);
}
}
