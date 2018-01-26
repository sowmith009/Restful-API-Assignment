
import java.text.*;
import java.util.*;

public class AgeUtil {
	public static void main(String[] args) {
		System.out.println("Enter your Date of Birth in format MM-dd-yyyy: ");
		Scanner input = new Scanner(System.in);
		String DateOfBirth = input.nextLine();
		System.out.println("Enter Current date in format MM-dd-yyyy: ");
		String currentDate = input.nextLine();
		try {
			Calendar calendar1 = new GregorianCalendar();
			Calendar calendar2 = new GregorianCalendar();
			int age = 0;
			int factor = 0;
			Date d1 = new SimpleDateFormat("MM-dd-yyyy").parse(DateOfBirth);
			Date d2 = new SimpleDateFormat("MM-dd-yyyy").parse(currentDate);
			calendar1.setTime(d1);
			calendar2.setTime(d2);
			if (calendar2.get(Calendar.DAY_OF_YEAR) < calendar1.get(Calendar.DAY_OF_YEAR)) {
				factor = -1;
			}
			age = calendar2.get(Calendar.YEAR) - calendar1.get(Calendar.YEAR) + factor;
			System.out.println("Your age is: " + age);
		} catch (ParseException e) {
			System.out.println(e);
		}
	}
}