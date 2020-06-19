import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String startDateString = in.next();

        LocalDate date = LocalDate.parse(startDateString);

        System.out.println(date.minusDays(10));

    }
}