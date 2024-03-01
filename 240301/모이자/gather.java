import java.util.*;
public class Main {
    static int [] arr;
    static final int MAX_VALUE = Integer.MAX_VALUE;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] =sc.nextInt();
        }

        int min = MAX_VALUE;

        for(int i = 0; i<n; i++){
            int sum = 0;
            for(int j=0; j<n; j++){
                sum+=arr[j]*Math.abs(j-i);
            }
            min = Math.min(min, sum);
        }
        System.out.println(min);
    }
}