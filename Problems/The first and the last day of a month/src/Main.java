import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        int month = in.nextInt();

        LocalDate date = LocalDate.of(year, month, 1);

       System.out.println(date+" "+date.plusMonths(1).minusDays(1));
    }
}