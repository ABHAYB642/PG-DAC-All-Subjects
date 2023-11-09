import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DateManipulator {
	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("enetr date");
		String d1 = sc.next();
		try {
			Date dt1 = sdf.parse(d1);
			System.out.println(dt1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/// to convert string to local date
		LocalDate dt2 = LocalDate.parse(d1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(dt2);
		// convert locaDate to String
		System.out.println(dt2.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		System.out.println("Year: " + dt2.getYear());

		// Difference between 2 days
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
		Date firstDate = sdf1.parse("06/24/2017");
		Date secondDate = sdf1.parse("06/30/2017");

		long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
		long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
		System.out.println("Differnce between " + firstDate + " and " + secondDate + " is " + diff);
	}
}
