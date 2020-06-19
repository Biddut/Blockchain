import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        int month = in.nextInt();

        LocalDate date= LocalDate.of(year,month,1);

        for (int i=1;i<date.lengthOfMonth()-1;i++) {
            if (date.plusDays(i).getDayOfWeek().equals(DayOfWeek.MONDAY)) {
                System.out.println(date.plusDays(i));
           }
        }
    }


}