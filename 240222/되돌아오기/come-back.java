import java.util.*;
import java.io.*;
public class Main {
    static int x =0;
    static int y = 0;
    // static int dirNum = 0;  // 0,1,2,3 각각 동, 남, 서, 북
    static int [] dx = new int[]{1,0,-1,0};
    static int [] dy = new int[]{0,-1,0,1};
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int consumeTime = 0; 

        for(int i=1; i<=n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String dir = st.nextToken();
            int distance = Integer.parseInt(st.nextToken());

            int dirNum = directionConverter(dir);

            for(int j=0; j<distance; j++){
                consumeTime++;
                x+=dx[dirNum];
                y+=dy[dirNum];
                if(x==0 && y==0){
                    break;
                }
            }
            if(x==0 && y==0){
                break;
            }
        }
        if(x==0 && y==0){
            System.out.println(consumeTime);
        }else{
            System.out.println(-1);
        }

    }
    public static int directionConverter(String direction){
        if(direction.equals("E")){
            return 0;
        }else if(direction.equals("S")){
            return 1;
        }else if(direction.equals("W")){
            return 2;
        }else{
            return 3;
        }
            
        }
    }