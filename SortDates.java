import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDates {

    public static void main(String[] args) {
        List<String> dateStrings = new ArrayList<>();
        dateStrings.add("01/03/2017");
        dateStrings.add("15/01/1998");
        dateStrings.add("03/02/2017");

        // Sort dates
        Collections.sort(dateStrings,Collections.reverseOrder());

        // Print sorted dates
        for (String dateString : dateStrings) {
            System.out.println(dateString);
        }
        
    }
}
