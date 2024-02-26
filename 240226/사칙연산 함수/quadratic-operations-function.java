import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        String o = st.nextToken();
        int c = Integer.parseInt(st.nextToken());
        calc(a,c,o);


    }
    public static void calc(int a, int c, String o){
        if(o.equals("+")){
            System.out.println(a+" + "+ c +" = "+(a+c));
        }else if(o.equals("-")){
            System.out.println(a+" - "+ c +" = "+(a-c));
        }else if(o.equals("/")){
            System.out.println(a+" / "+ c +" = "+(int)(a/c));
        }else if(o.equals("*"){
            System.out.println(a+" * "+ c +" = "+(a*c));
        }else{
            System.out.println("False");
        }
    }
}