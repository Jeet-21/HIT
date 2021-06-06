package Lab1;

public class Armstrong {

	public static void main(String[] args) {
		int number = 153;
		int realno;
		int remainder;
		int result = 0;
		realno = number;
		
		while (realno != 0) {
			remainder = realno % 10;
			result += Math.pow(remainder, 3);
			realno /= 10;
		}
		if (result == number)
			System.out.println(number + " is an Armstrong Number.");
		else
			System.out.println(number + " is not an Armstrong Number.");
	}

}
