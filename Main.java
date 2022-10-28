import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        int[][] years = {{1900,1910},{1909,1935},{1920,1940},{1950,1951},{1925,1940},{1938,1955},{1942,1956},{1950,2000},{1960,1970},{1965,1985},{1900,2000}};
  //     int[][] years ={{1901,1921},{1915,1930}};

        Map<Integer,Integer> Count= new TreeMap<>();
        Map<Integer,Integer> maxYear = new TreeMap<>();
        int max = 0;
        int temp = 0;
        int prev=0;
        for(int[] a:years){
            Count.put(a[0],Count.getOrDefault(a[0]+1,1));
            Count.put(a[1]+1,Count.getOrDefault(a[1]-1,-1));

        }
        for (Map.Entry<Integer,Integer> m:Count.entrySet()){
            temp += m.getValue();
            maxYear.put(m.getKey(), temp);
            if(max<temp){
                max = temp;

            }
        }
        System.out.println("Max = "+max);
        for (Map.Entry<Integer,Integer> m:maxYear.entrySet()){
//            System.out.println(m.getKey());
//            System.out.println(m.getValue());

            if(max==m.getValue()){
                System.out.print(m.getKey()+"  to  ");
            }
            if(prev!=0 && maxYear.get(prev)==max){
                System.out.println(m.getKey()-1);
            }
            prev = m.getKey();



        }

    }
}
//{{1900,1910},{1909,1935},{1920,1940},{1925,1940},{1938,1955},{1942,1956},{1950,1960},{1955,1960}}