import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int first_age = Integer.parseInt(st.nextToken());
        String first_sex = st.nextToken();

        st = new StringTokenizer(br.readLine());

        int second_age = Integer.parseInt(st.nextToken());
        String second_sex = st.nextToken();


        if((first_age>=19 && first_sex.equals("M")) || (second_age>=19 && second_sex.equals("M"))){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
        

    }
}