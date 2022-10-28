import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        String[] input = {"abba","abcd"};
        for (String s : input) {
            Map<Integer, Integer> Count = new HashMap<>();
            int count = 0;
            System.out.println(s);
            for (int i = 0; i < s.length(); i++) {

                int acsii = 0;
                for (int j = i; j < s.length(); j++) {
                    acsii = s.charAt(j) + acsii;
                    if (Count.get(acsii) != null) {
                        Count.put(acsii, Count.get(acsii) == 0 ? 1 : 0);
                    } else {

                        Count.put(acsii, 1);
                    }

                }
            }
            for (int num : Count.keySet()) {
                if (Count.get(num) == 0) {
                    ;
                    count++;

                }
            }
            System.out.println(count);
        }
    }
}
