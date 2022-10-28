import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class largestsubarray {
    public static void main(String[] args) {
        int[] inputArray = {16,17,4,3,5,2};
        ArrayList<Integer> result = new ArrayList<>();
        int max = inputArray[5];
        result.add(max);
        for (int i = 4;i>=0;i--){
            if(inputArray[i]>max){
                max = inputArray[i];
                result.add(max);
            }

        }
        result.sort(Comparator.reverseOrder());
        System.out.println(result.toString());

    }
}
