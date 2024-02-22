import java.util.*;
import java.io.*;
public class Main {
    static int dirNum;  // 0,1,2,3 각각 동,남,서,북
    static int[] dx = new int[]{1,0,-1,0};
    static int[] dy = new int[]{0,-1,0,1};    
    static int x = 0;
    static int y = 0;

    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        dirNum =3;
        int answer = 0;


        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);

            if(ch=='F'){
                x+=dx[dirNum];
                y+=dy[dirNum];
            }else if(ch=='L'){  // 왼쪽으로 90도 회전
                dirNum = (dirNum+3)%4;
      
            }else{  // 오른쪽으로 90도 회전
                dirNum = (dirNum+1)%4;
            }

            if(x==0 && y==0){
                answer = i+1;
                break;
            }
        }

        if(answer !=0){
            System.out.println(answer);
        }else{
            System.out.println(-1);
        }


    }
}