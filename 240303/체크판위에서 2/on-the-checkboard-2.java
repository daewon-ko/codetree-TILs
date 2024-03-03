import java.util.*;
import java.io.*;
public class Main {
    static int r;
    static int c;
    static String [][] graph;
    static int answer;

    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        graph = new String[r][c];

        for(int i=0; i<r; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<c; j++){
                graph[i][j] = st.nextToken();
            }
        }

        int cnt = 0;

        for(int i=1; i<r; i++){
            for(int j=1; j<c; j++){
                for(int k= i+1; k<r-1; k++){
                    for(int l=j+1; l<c-1; l++){
                        if(!graph[0][0].equals(graph[i][j]) &&
                        !graph[i][j].equals(graph[k][l]) && 
                        !graph[k][l].equals(graph[r-1][c-1])){
                            cnt++;
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }



        // public static void func(int r, int c, int jump){
           

        //     for(int i=0; i<r; i++){
        //         for(int j=0; j<c; j++){
        //             for(int m=i+1; m<r; m++){
        //                 for(int n=j+1; n<c; n++){
        //                     if(i==r-1 && j == c-1 && jump==2){
        //                         answer++;
        //                         return;
        //                     }


        //                     if(!graph[i][j].equals(graph[m][n])){
        //                         func(m,n,jump+1);
        //                     }
        //                 }
        //             }

        //         }
        //     }
        // }


    }