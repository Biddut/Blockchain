import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String stringArray = in.nextLine();
        String[] arr=stringArray.split(" ");
        //take the input in string array separated by whitespaces" "
        int[] a=new int[arr.length];
        for(int i=0;i<arr.length;i++) {
            a[i] = Integer.parseInt(arr[i]);
        }

        int noRotation = in.nextInt();

        in.close();

        int reduceRotation=noRotation%a.length;
       //int[] a= {1,2,3,4,5};
       // int noRotation=6;
        //time limit exceed solutions
        for(int i=0; i <reduceRotation  ; i++){
            int temp=a[a.length-1];
            for(int j=a.length-1; j > 0; j--){
                   a[j]=a[j-1];
            }
            a[0]=temp;

        }

        //System.out.println(Arrays.toString(a));

        for(int c: a){
            System.out.print(c+" ");
        }


    }
}