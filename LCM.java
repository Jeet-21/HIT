package Lab1;

public class LCM {

	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 50;
		int lcm;
		
		lcm = (num1 > num2) ? num1 : num2;
		
		while (true) {
			if (lcm % num1 == 0 && lcm % num2 == 0) {
				System.out.printf("The LCM of %d & %d is %d", num1, num2, lcm);
				break;
			}
		++lcm;
		}
	}

}
