import java.util.*;
public class Main {

    static final int MAX = 1000;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int [][] arr = new int [MAX+1][2];
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            int [] visited = new int[MAX+1];

            for(int j= 0; j<n; j++){
                if(i==j){
                    continue;
                }

      

                int a = arr[j][0];
                int b = arr[j][1];


                for(int k= a; k<b; k++){
                    visited[k] = 1;
                }

            }

            int sum = 0;
            for(int m =0; m<visited.length; m++){
                sum+=visited[m];

            }
            max = Math.max(sum, max);

        }

        System.out.println(max);
    }
}