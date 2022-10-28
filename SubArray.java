public class SubArray {
    public static void main(String[] args) {
        int n = 8;
        int []a = {15,-2,2,-8,1,7,10,23};
        int max = 0;
        for(int i = 0;i<8;i++){
            int sum = 0;
            for(int j = i;j<8;j++){
                sum = sum + a[j];
                if(sum == 0){
                    if(j - i + 1 > max)
                    max = j - i + 1 ;
                }
            }
        }
        System.out.println(max);
    }
}
