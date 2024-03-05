import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for(int i=0; i<n-2; i++){
            int sum = 0;
            for(int j=i+2; j<n; j++){
                sum = arr[i]+arr[j];
                max = Math.max(max, sum);
            }
        }
        System.out.println(max);
    }
}