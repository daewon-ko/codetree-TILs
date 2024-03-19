import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Scanner sc = new Scanner(System.in);
        String word;
        while(!(word = br.readLine()).equals("END")){
            // String input = word; 
            // String input = br.readLine();
            StringBuilder sb = new StringBuilder(word).reverse();
            // for(int i= word.length()-1; i>=0; i--){
            //     char c = word.charAt(i);
            //     sb.append(String.valueOf(c));
            // }
            System.out.println(sb.toString());
        }
    }
}