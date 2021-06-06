package Lab1;

public class WithoutSwap {
	public static void main(String[] args) {
		int a = 200;
		int b = 400;
		System.out.println("Before Swapping:-");
		System.out.println("First Number: "+a);
		System.out.println("Second Number: "+b);
		a = a - b;
		b = a + b;
		a = a - b;
		System.out.println("After Swapping:-");
		System.out.println("First Number: "+a);
		System.out.println("Second Number: "+b);
	}

}
