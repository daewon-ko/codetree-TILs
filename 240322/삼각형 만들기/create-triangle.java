import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        /**
        * 세 점 중 각각 두 점은 y의 값이 같고(&&) x의 값이 같아야한다. 
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int [][] graph = new int[n][2];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[i][0]= x;
            graph[i][1] = y;
        }
        
        double max = 0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    int x1 = graph[i][0];
                    int y1 = graph[i][1];

                    int x2 = graph[j][0];
                    int y2 = graph[j][1];

                    int x3 = graph[k][0];
                    int y3 = graph[k][1];

                    if((x1== x2 && y1 == y3) || (x1==x2 && y2==y3) 
                    || (x2 ==x3 && y2 == y1) || (x2==x3 && y3 == y1)
                    || (x3 ==x1 && y3 == y2) || (x3==x1 && y1 == y2) 
        
                    
                     ){
                        double result = Math.abs((x1*y2 + x2*y3 + x3*y1) -(x2*y1 + x3*y2 + x1*y3))/2;
                        max = Math.max(max, result);
                    }
                }
            }
        }

        System.out.println((int)(2*max));

    }
}