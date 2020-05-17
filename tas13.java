
import java.util.Scanner;

public class tas13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int inputNumber;
		int firstNum;
		int secondNum;
		int thirdNum;
		int fourthNum;
		int fifthNum;
		int sum;

		System.out.println("Please enter five digit positive number: ");

		inputNumber = input.nextInt();

		firstNum = inputNumber / 10000 % 10;
		secondNum = inputNumber / 1000 % 10;
		thirdNum = inputNumber / 100 % 10;
		fourthNum = inputNumber / 10 % 10;
		fifthNum = inputNumber % 10;

		sum = firstNum + secondNum + thirdNum + fourthNum + fifthNum;

		System.out.println("The sum of the digits is: " + firstNum + " + " + secondNum + " + " + thirdNum + " + "
				+ fourthNum + " + " + fifthNum + " = " + sum);

	}

}
