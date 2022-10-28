import java.util.HashMap;
import java.util.Map;

public class Occurance {
    public static void main(String[] args) {
        int N = 7;
        int K = 2;
        int[] A = {1,7,4,3,4,8,7};

        Map<Integer,Integer> Count= new HashMap<>();

        for (int number:A) {
            if(Count.get(number)!=null){
                Count.put(number, Count.get(number)+1);
                if(Count.get(number)==K){
                    System.out.println(number);
                    break;
                }
            }
            Count.put(number,1);


        }


    }
}
