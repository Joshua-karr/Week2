import java.util.Scanner;

public class Task2_2 {
	public static void main(String[] args) {

		boolean isNotValid = true;
		Scanner input = new Scanner(System.in);

		while (isNotValid) {

			try {

				System.out.println("Please input a degree in Fahrenheit: ");
				Integer fahrenheit = Integer.parseInt(input.nextLine());

				if (fahrenheit > -100 && fahrenheit < 212) {
					isNotValid = false;
					double fahToCel = (5.0 / 9) * (fahrenheit - 32);
					System.out.println(fahrenheit + "F is equivalent to " + fahToCel + "C");

					System.out.println("Please input a degree in Celsius: ");
					int celsius = input.nextInt();
					double celToFah = (celsius * 9.0 / 5) + 32;
					System.out.println(celsius + "C is equivalent to " + celToFah + "F");

				} else {
					System.out.println("Input needs to be number! Please try again");
				}

			} catch (Exception e) {
				System.out.println("Input needs to be number! Please try again");
			}
		}
	}
}
