import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int [][] arr = new int [n+1][2];

        for(int i=1; i<=n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x  = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[i][0] = x;
            arr[i][1] = y;

        }

        int min = Integer.MAX_VALUE;

        for(int i=1; i<=n; i++){
            for(int j=i+1; j<=n; j++){
                int betweenX=Math.abs(arr[i][0] - arr[j][0]);
                int betweeny = Math.abs(arr[i][1] - arr[j][1]);

                min=Math.min(min, (betweenX*betweenX + betweeny*betweeny));


            }
        }
        System.out.println(min);
        
    }
}