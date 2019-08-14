import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/*
 * 
 * Date: "15 June 2015, 08 February 2019, 30 June 2001, 30 June 2019"
 * 
 * 
 * */

class DateSorting{
	public static void main(String[] args) {
		String date = "15 June 2015,08 February 2019,30 July 2001,30 June 2019,07 February 2019";
		
		String[] temp = date.split(",");
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
		LocalDate[] dateArray = new LocalDate[temp.length];
		
		for(int i = 0; i < temp.length; i++) {
			String[] s = temp[i].split(" ");
			dateArray[i] = LocalDate.of(Integer.parseInt(s[2]), Month.valueOf(s[1].toUpperCase()),
											Integer.parseInt(s[0]));
			
		}
		
		Arrays.stream(dateArray)
			.sorted()
			.forEach(x -> System.out.println(formatter.format(x)));
		
	}
}




