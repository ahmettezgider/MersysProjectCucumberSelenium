
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class xx {
    public static void main(String[] args) {

        String time = "";
        time = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        time += " - " + LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        System.out.println(time);
    }
}
