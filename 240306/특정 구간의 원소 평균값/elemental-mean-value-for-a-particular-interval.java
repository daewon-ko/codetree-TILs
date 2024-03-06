import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        // 구간의 원소가 같음을 3번째 For문에서 어떻게 비교할 것인가? 
        
        /**
        * 구간을 잡는다는 것을 어떻게 표현해줘야 적절할까? 
        */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int tot = 0;


        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){

                int sum = 0;
                int cnt = 0;

                for(int k=i; k<=j; k++){
                    sum+=arr[k];
                    cnt++;
                }
                double avg= (double) sum/cnt;

                for(int k=i; k<=j; k++){
                    if(avg==arr[k]){
                        tot++;
                        break;
                    }
                }

            }
        }

        System.out.println(tot);

        
    }
}