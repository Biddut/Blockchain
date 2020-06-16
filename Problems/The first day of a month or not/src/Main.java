import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void  main(String[] args) {
        // put your code here
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        int dayOfYear = in.nextInt();

        LocalDate date1 = LocalDate.of(year, 1, 1);
        LocalDate date2=date1.plusDays(dayOfYear-1);
       // System.out.println(date1);
      //  System.out.println(date2);
        if(date2.getDayOfMonth()==1) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
}