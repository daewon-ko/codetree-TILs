import java.util.*;
public class Main {
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[1003];
        for(int i=1; i<=n; i++){
            arr[i] = sc.nextInt();
        }



        for(int i=1; i<=n; i++){    // i번쨰가 기준방
            int sum = 0;
            for(int j=(i+1); j<=n; j++){ // n-i번만큼 돌 수 있음

                // if(i==j){
                //     continue;
                // }
                

                sum+= Math.abs(i-j)*arr[j];
                
                // sum+=((5-(i+j)%5)*arr[j]);
            }

            for(int j=1; j<i; j++){
                sum+=((5-i)+j)*arr[j];
            }
            min = Math.min(min,sum);
        }
        System.out.println(min);
    }
}