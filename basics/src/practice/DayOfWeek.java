package practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DayOfWeek {


	
	public static void printDayOfWeek(String dateString) {
		String[] stringDateArray = dateString.split("-");
        int[] dateArrayFormatted = new int[3];
        dateArrayFormatted[0] = Integer.parseInt(stringDateArray[0]) - 1900;
        dateArrayFormatted[1] = Integer.parseInt(stringDateArray[1]) - 1;
        dateArrayFormatted[2] = Integer.parseInt(stringDateArray[2]);
        System.out.println(new SimpleDateFormat("EEEE")
                .format(new Date(dateArrayFormatted[0], dateArrayFormatted[1], dateArrayFormatted[2])));  

	}
}
