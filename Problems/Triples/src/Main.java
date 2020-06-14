import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int triples=0;
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();

        }

        for(int a_i=0; a_i < a.length-2; a_i++){

           if((a[a_i]+1==a[a_i+1])&&(a[a_i]+2==a[a_i+2])){
                    triples++;
                   // a_i=a_i+3;
                }

        }

        System.out.println(triples);
        // put your code here
    }
}