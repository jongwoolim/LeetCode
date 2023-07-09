import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        List<String> days = Arrays.asList(
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        );

        Map<Integer, String> map = new HashMap<>();

        int i = 1;
        for(String strDay : days){
            map.put(i++, strDay);
        }

        LocalDate localDate = LocalDate.of(year, month, day);
        return map.get(localDate.getDayOfWeek().getValue());
    }
}