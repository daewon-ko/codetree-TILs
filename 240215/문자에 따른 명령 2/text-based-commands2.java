import java.util.*;
import java.io.*;

public class Main {

    static int [] dx = new int []{1,0,-1,0};
    static int [] dy = new int []{0,-1,0,1};
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int cnt_L = 0;
        int cnt_R = 0;
        int cnt_F = 0;

        int dirNum = 3;
        int x=0;
        int y =0;


        for(int i=0; i<input.length(); i++){
            char c = input.charAt(i);

            if(c=='L')
                cnt_L++;
            else if(c=='R'){
                cnt_R++;
            }else if(c=='F'){
                cnt_F++;
            }
        }

        for(int i=0; i<cnt_L; i++){
            dirNum= (dirNum-1+4)%4;
        }

        for(int i=0; i<cnt_R; i++){
            dirNum = dirNum%4;
        }

        x=x+dx[dirNum];
        y+=dy[dirNum];

        System.out.print(x+" "+y);



    }
}