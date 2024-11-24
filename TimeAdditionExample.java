import java.time.LocalDateTime;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class TimeAdditionExample {
    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();

        // Add 2 hours
        LocalDateTime updatedTime = now.plusHours(2);

        // Add 20 minutes
        updatedTime = now.plusMinutes(20);

        // Add 300 seconds
        updatedTime = now.plusSeconds(300);

 

        System.out.println("Updated date-time: " + updatedTime);

      
    }
}