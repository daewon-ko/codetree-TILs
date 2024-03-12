import java.util.*;
public class Main {
    static int [] arr;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        arr = new int[6];

        for(int i=0; i<6; i++){
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;

        for(int i=0; i<6; i++){
            for(int j=i+1; j<6; j++){
                for(int k= j+1; k<6; k++){


                    min = Math.min(min, func(i,j,k));

                }
            }
        }
        System.out.println(min);
    }

    public static int func(int i, int j, int k){

        int totalSum = 0;
        for(int l=0; l<6; l++){
            totalSum +=arr[l];
        }
        int sum = arr[i]+arr[j]+arr[k];
        int sum2 = 0;

        sum2 = totalSum- sum;

        return Math.abs(sum - sum2);
    }
}