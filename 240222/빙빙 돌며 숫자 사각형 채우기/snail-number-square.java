import java.util.*;

public class Main {
    static int n;
    static int m;
    static int dirNum = 0;
    static int [] dx = new int[]{0,1,0,-1};
    static int [] dy = new int[]{1,0,-1,0};
    static int x=0;
    static int y =0;
    static int [][] graph;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();   // 행
        m = sc.nextInt();   // 열
        graph = new int[n][m];

        graph[x][y]=1;

        for(int i=2; i<=n*m; i++){


                int nx = x+dx[dirNum];
                int ny = y+dy[dirNum];

                if(!(inRange(nx, ny)) || graph[nx][ny]!=0 ){
                    dirNum = (dirNum+1)%4;
                }

                x+=dx[dirNum];
                y+=dy[dirNum];

                graph[x][y] = i;
            }
        

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }


    }
    public static boolean inRange(int x, int y ){
        return x>=0 && x<n && y>=0 && y<m;
    }
}