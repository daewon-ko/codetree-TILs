import java.util.*;
public class Main {
    static final int max_n = 100;
    static final int max_num = 40000;

    static int [] x = new int[max_n];
    static int [] y = new int[max_n];
        public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int ans = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            int minX =max_num;
            int maxX = 1;
            int minY = max_num;
            int maxY = 1;
            for(int j=0; j<n; j++){
                if(i==j){
                    continue;
                }
                minX = Math.min(minX, x[j]);
                maxX = Math.max(maxX, x[j]);
                minY = Math.min(minY, y[j]);
                maxY = Math.max(maxY, y[j]);
            }
            ans = Math.min(ans, (maxX - minX)*(maxY - minY));
        }
        System.out.println(ans);

        
        
    }
}