import java.util.*;
import java.text.*;

public class Formatting {
	public static void main(String args[]) {
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

		System.out.println("Current Date: " + ft.format(dNow));

		Date date = new Date();

		String str = String.format("Current Date/Time : %tc", date);

		System.out.println(str);
		
		System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);
	}
}
