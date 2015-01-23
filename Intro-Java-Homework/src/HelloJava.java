import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;


public class HelloJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
		}
		System.out.println("Hello Java!");
		System.out.println("I am the greates!!!");
		int a = 255;
		System.out.format("This is weird: %x", a);
		System.out.println();
		double pi = Math.PI;
		System.out.println(pi);
		System.out.format("%1$.3f", pi);
		System.out.println();
		
		//Date newDate = new Date();
		//System.out.println(newDate);
		System.out.println("now: " + LocalDateTime.now());
		ZonedDateTime date = ZonedDateTime.now();
		System.out.println(date);
		
		String firstDateStr = "14-05-2014";
		String secondDateStr = "14-06-1980";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			Date firstDate = sdf.parse(firstDateStr);
			Date secondDate = sdf.parse(secondDateStr);
			long days = secondDate.getTime() - firstDate.getTime();
			System.out.println("The days between two dates is: " + 
			days / (60 * 60 * 24 * 1000));
		} catch (ParseException e) {
			e.printStackTrace();
			System.out.println("Error in parsing!");
		}
	}

}
