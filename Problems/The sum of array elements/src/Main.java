import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int sum=0;
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            sum+=a[a_i];
        }

        System.out.println(sum);
        // put your code here
    }
}