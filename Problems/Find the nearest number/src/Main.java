import java.util.*;

//1) scan the line and store the integers to a list or array.
// 2) find what is the minimum value overall and store it.
// 3) make a list of all the numbers that their Math.abs(n - ar[i]) equals with the min value.
// 4 ) Sort it using Collections.sort(list).
// 5) Print each list element.
public class Main {
    public static void main(String[] args) {
        // write your code here

        Scanner in = new Scanner(System.in);
        String strInt=in.nextLine();
        String[] tokens = strInt.split(" ");
        List<Integer> integerList= new ArrayList<>();

        for(int a_i=0; a_i < tokens.length; a_i++){
            integerList.add(Integer.parseInt(tokens[a_i]));
        }

        int targerInt=in.nextInt();
      //  System.out.println(integerList);
      //  System.out.println(targerInt);
        int minDistance=Integer.MAX_VALUE;

        for(int i=0; i < integerList.size(); i++){
            if(Math.abs(targerInt-integerList.get(i))<minDistance){
                minDistance=Math.abs(targerInt-integerList.get(i));
             //   System.out.println(minDistance);
            }
        }

      //  System.out.println(minDistance);

        List<Integer> minDistanceList= new ArrayList<>();
        for(int i=0; i < integerList.size(); i++){
            if(Math.abs(targerInt-integerList.get(i))==minDistance){
                minDistanceList.add(integerList.get(i));

            }

        }

        Collections.sort(minDistanceList);

        Iterator<Integer> itr= minDistanceList.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }






    }
}