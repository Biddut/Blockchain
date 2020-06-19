import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner in = new Scanner(System.in);
        int seconds = in.nextInt();

        LocalTime localtime = LocalTime.ofSecondOfDay(seconds);
        System.out.println(localtime);

    }
}