import java.util.*;
import java.io.*;
public class Main {
    static int [][] graph;
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        graph = new int[n][n];
        
        for(int i = 0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int max = 0;

        for(int i=0; i<n; i++){
            int sum =0;
            for(int j=0; j<n-2; j++){
                max = Math.max(max,graph[i][j]+graph[i][j+1]+graph[i][j+2]);
            }
        }
        System.out.println(max);
        br.close();

    }
}