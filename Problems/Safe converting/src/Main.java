import java.util.Scanner;

public class Main {

    public static int convert(Long val) {

        if(val==null){

            return 0;
        }
        else {
            int integerVal = val>Integer.MAX_VALUE? Integer.MAX_VALUE:(val<Integer.MIN_VALUE?Integer.MIN_VALUE:val.intValue());
            return integerVal;
        }


    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine();
        Long longVal = "null".equals(val) ? null : Long.parseLong(val);
        System.out.println(convert(longVal));
    }
}