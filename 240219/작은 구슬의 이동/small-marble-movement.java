import java.util.*; 
import java.io.*;
public class Main {
    static int [][] graph;
    static int n;
    static int [] dx = new int[]{0,1,-1,0};
    static int [] dy = new int[]{1,0,0,-1};
    static int r, c;
    static int dirNum;
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        //n x n 배열
        graph = new int[n][n];
        st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        String direction = st.nextToken();
    
        dirNum = getDirectionNumber(direction);



        for(int i=0; i<t; i++){
            updatePosition();
            isRange();
            //  r= r+dx[dirNum];
            //  c = c+dy[dirNum];
            //  isRange(r,c, dirNum);
        }

        System.out.println(r+" "+c);
        // bw.write(nx+" "+ny);

        bw.close();
        br.close();


        
        
    }

    public static int getDirectionNumber(String direction){
        if(direction.equals("U")){
            return 2;
        }else if(direction.equals("D")){
            return 1;
        } else if(direction.equals("R")){
            return 0;
        } else {
            return 3;
        }
    }


        public static void isRange() {
        if (r < 0 || r >= n || c < 0 || c >= n) {
            r = Math.max(0, Math.min(r, n - 1));
            c = Math.max(0, Math.min(c, n - 1));
        }
    }

    public static void updatePosition() {
        int nx = r + dx[dirNum];
        int ny = c + dy[dirNum];

        // 범위를 벗어날 경우 방향을 전환합니다.
        if (r < 0 || r >= n || c < 0 || c >= n) {
            dirNum = 3 - dirNum;
        }else {
            r = nx;
            c = ny; 
        }
    }


    // public static void isRange() {
    //     if (r < 0 || r >= n || c < 0 || c >= n) {
    //         r = Math.max(0, Math.min(r, n - 1));
    //         c = Math.max(0, Math.min(c, n - 1));
    //         dirNum = 3 - dirNum; // 방향 전환
    //     }
    // }

    // public static void updatePosition() {
    //     r = r + dx[dirNum];
    //     c = c + dy[dirNum];
    // }

    // public static void isRange(int x, int y, int dirNum){
    //     if(x==-1 || x==n ){
    //         x+=(dx[3-dirNum]);
    //     }
    //     else if(y ==-1 || y ==n){
    //         y+=(dy[3-dirNum]);
    //     }
    //     else if(x>=0 && x<n && y>=0 && y<n){
    //         return;
    //     }

    // }
}