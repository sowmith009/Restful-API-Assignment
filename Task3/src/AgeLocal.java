
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeLocal {

	public static void main(String[] args) {

		System.out.print("Enter your Date of Birth in YYYY-MM-DD: ");

		Scanner scann = new Scanner(System.in);

		String input = scann.nextLine();

		scann.close();

		LocalDate DoB = LocalDate.parse(input);

		System.out.println("Your Age is:" + getAge(DoB));

	}

	// Returns age given the date of birth

	public static int getAge(LocalDate DoB) {

		LocalDate CurrentDate = LocalDate.now();

		return Period.between(DoB, CurrentDate).getYears();

	}

}