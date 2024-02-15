import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static int [][] graph;
    static int [] dx = new int []{0,1,0,-1};
    static int [] dy = new int []{1,0,-1,0};
    public static void main(String[] args) throws IOException{

    
        // 여기에 코드를 작성해주세요.


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        graph = new int[n][n];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                graph[i][j]= Integer.parseInt(st.nextToken());
            }
        }



    
       
       // 1행 1열부터 n행 n열까지 탐색한다.

       int x =0;
       int y = 0;
       int result = 0;
        
        for(int i=0; i<n; i++){

            

            for(int j=0; j<n;j++){

                int cnt = 0;

                for(int dirNum=0; dirNum<4; dirNum++){


                    int nx = i+dx[dirNum];
                    int ny= j+dy[dirNum];
                    if(isRange(nx, ny) && graph[nx][ny]==1){
                        cnt++;
                    }

                    if(cnt>=3){
                        result++;
                        break;
                    }
                }

            } 
        }

        System.out.println(result);
        
        br.close();



    }

    public static boolean isRange(int x, int y ){
        return (x>=0 && x<n && y>=0 && y<n); 
    }
}