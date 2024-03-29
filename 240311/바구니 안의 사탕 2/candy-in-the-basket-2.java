import java.util.*;
public class Main {


    static final int max_num = 100;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int [] arr = new int[max_num+1];

        int max_index=0;

        for(int i=0; i<n; i++){
            int candy_count = sc.nextInt();
            int index = sc.nextInt();
            arr[index] += candy_count;
            // max_index = Math.max(max_index, index);
        }

        // int [] arr2=Arrays.copyOf(arr, max_index);

        // int l = arr2.length-1;

        int max= Integer.MIN_VALUE;

        for(int i=0; i<=max_num; i++){
            int sum = 0;
            for(int j=i-k; j<=i+k; j++){
                if(j>=0 && j<=max_num){
                    sum+=arr[j];
                }
                
               max =  Math.max(sum,max);
            }
        }

        System.out.println(max);
    }
}