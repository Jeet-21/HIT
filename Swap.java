package Lab1;

public class Swap {
	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 100;
		System.out.println("Before Swapping:-");
		System.out.println("First Number: "+num1);
		System.out.println("Second Number: "+num2);
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After Swapping:-");
		System.out.println("First Number: "+num1);
		System.out.println("Second Number: "+num2);
	}
}
