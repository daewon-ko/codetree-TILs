import java.util.*;
import java.io.*;
public class Main {
    static int [][] graph;
    static int [] dx = new int[]{0,1,0,-1};
    static int [] dy = new int[]{1,0,-1,0};
    static int n;
    // static int dirNum;
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        graph = new int[n][n];
        

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x-1][y-1] = 1;
            int cnt = 0;

            for(int dirNum=0; dirNum<4; dirNum++){
                
                int nx = x-1+dx[dirNum];
                int ny = y-1+dy[dirNum];

                if(inRange(nx,ny)&& graph[nx][ny]==1){
                    cnt++;
                }
                
            }
            if(cnt==3){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }


    }
    public static boolean inRange(int x, int y){
        return x>=0 && x<n && y>=0 && y<n;
    }
}