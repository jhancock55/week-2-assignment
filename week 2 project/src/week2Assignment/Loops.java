package week2Assignment;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// coding step 5, creating loops

		Scanner codingStep = new Scanner(System.in);

		System.out.println("Enter coding step to perform: a, b, c, or d?");
		String answer = codingStep.nextLine();

		// using switch function to run each coding step independently
		switch (answer) {

		// a) a while loop that prints all even numbers from 0 to 110
		case "a": {

			int j = 0;
			while (j <= 110) {
				if (j % 2 == 0) {
					System.out.println(j);
				}
				j++;
			}
			break;
		}

		// b. A while loop that prints every 3rd number going backwards from 100 until
		// we reach 0
		case "b": {
			int h = 100;
			while (h >= 0) {
				System.out.println(h);
				h -= 3;
			}
			break;
		}

		// c. A for loop that prints every other number from 1 to 100
		case "c": {
			for (int i = 1; i <= 100; i += 2) {
				System.out.println(i);
			}
			break;
		}

		// d. A for loop that prints every number from 0 to 100,
		// but if the number is divisible by 3, it prints “Hello” instead of the number,
		// and if the number is divisible by 5, it prints “World” instead of the number,
		// and if it is divisible by both 3 and 5, it prints “HelloWorld” instead of the
		// number.
		case "d": {
			for (int k = 0; k <= 100; k++) {
				if (k % 3 == 0) {
					System.out.print("Hello");
				}
				if (k % 5 == 0) {
					System.out.println("World");
				} else if (k % 3 == 0) {
					System.out.println();
				}

				if (k % 3 != 0 && k % 5 != 0) {
					System.out.println(k);
				}
			}
			break;
		}
		}

	}

}
