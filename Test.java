import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		c.set(1582, Calendar.OCTOBER, 4);
		System.out.println(c.getTime());
		c.add(Calendar.DAY_OF_MONTH, 1);
		System.out.println(c.getTime());
		
		System.out.println("---------------");
		
		c = new GregorianCalendar(1582, Calendar.OCTOBER, 4);
		System.out.println(c.getTime());
		c.add(Calendar.DAY_OF_MONTH, 1);
		System.out.println(c.getTime());
	}

}