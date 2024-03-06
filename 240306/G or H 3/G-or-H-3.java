import java.util.*;
import java.io.*;
public class Main {
    static int n;
    static int k;
    static int r;
    static int [] place;
    static String [] alphabet;
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken())+1;

        String [] graph = new String [10000+1];

        // place = new int[n+1];
        // alphabet = new String[n+1];



        r = 0; 

        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine());
            int index = Integer.parseInt(st.nextToken());
            String alphabet = st.nextToken();
            graph[index] = alphabet;
            r=Math.max(r,index);
        }

        int max = Integer.MIN_VALUE;

         for(int i=1; i<=r-k+1; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=i; j<i+k; j++){
                sb.append(graph[j]);                
            }
            int score = convert(sb.toString());
            max = Math.max(max, score);
         }
         System.out.println(max);


    }

    public static int convert(String word){
        int number = 0; 
        for(int i=0; i<word.length();  i++){
            char c=word.charAt(i);
            if(c =='G'){
                number+=1;
            }else if(c=='H'){
                number+=2;
            }
        }
        return number;
    }
}