import java.util.*;

class LeapYear {
	public static void main(String[] args) {
		boolean isLeapYear;
		System.out.println("Enter the Year");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		// divisible by 4
		isLeapYear = (year % 4 == 0);
		// divisible by 4 and not 100
		isLeapYear = isLeapYear && (year % 100 != 0);
		// divisible by 
		isLeapYear = isLeapYear || (year % 400 == 0);

		if (isLeapYear) {
			System.out.println(year + " is Leap Year.");
		}
		else {
			System.out.println(year + " is not a Leap Year.");
		}
	}
}