import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        String first=s.substring(4,8);

        String last = s.substring(9,13);

        System.out.println("010-"+last+"-"+first);
    }
}