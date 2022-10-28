import java.util.HashMap;
import java.util.Map;

public class Arrayequality {
    public static void main(String[] args) {
        int N = 6;
        int[] A = {1, 2, 5, 4, 0,2};
        int[] B = {2, 4, 5, 0, 1,2};
        int sum = 0;

        Map<Integer, Integer> Count = new HashMap<>();

        for (int i = 0; i < N; i++) {
            if (Count.get(A[i]) != null) {
                Count.put(A[i], Count.get(A[i]) == 0 ? 1 : 0);


            }else {
                Count.put(A[i], 1);

            }

            if(Count.get(B[i])==null){
                Count.put(B[i], 1);
            }else{
                Count.put(B[i], Count.get(B[i]) == 0 ? 1 : 0);
            }
        }
        for (Map.Entry<Integer,Integer> m:Count.entrySet()){
           sum = m.getValue() + sum;
        }
        if(sum==0){
            System.out.println("Equal");
        }
    }
}
