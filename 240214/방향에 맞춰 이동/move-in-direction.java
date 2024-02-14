import java.util.*;
import java.io.*;

public class Main {

    static int [] dx = new int[]{1,0,-1,0};
    static int [] dy = new int[]{0,-1,0,1};

    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int x=0;
        int y =0;

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String dir = st.nextToken();
            int depth = Integer.parseInt(st.nextToken());

            for(int j=0; j<depth; j++){
                if(dir.equals("E")){
                    x+=dx[0];
                    y+=dy[0];
                }else if(dir.equals("S")){
                    x+=dx[1];
                    y+=dy[1];
                }else if(dir.equals("W")){
                    x+=dx[2];
                    y+=dy[2];
                }else if(dir.equals("N")){
                    x+=dx[3];
                    y+=dy[3];
                }
            }
        }

        System.out.print(x+" "+y);
        br.close();
    }
}