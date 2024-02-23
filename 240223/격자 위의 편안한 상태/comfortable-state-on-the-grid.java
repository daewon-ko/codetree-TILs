import java.util.*;
import java.io.*;
public class Main {
    /**
    * 배열 인덱스로 골치썩음

    어떻게 하는게 가장 좋은 방법일까? 
    노상 헷갈리는 개념이다
    */
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

        graph = new int[n+1][n+1];
        

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = 1;
            int cnt = 0;

            for(int dirNum=0; dirNum<4; dirNum++){
                
                int nx = x+dx[dirNum];
                int ny = y+dy[dirNum];

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
        return x>=1 && x<n+1 && y>=1 && y<n+1;
    }
}