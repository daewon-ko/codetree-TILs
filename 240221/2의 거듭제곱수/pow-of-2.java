import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        int x =2 ;
        while(n/2>1){
            x = n/2;
            n = x;
        }

        System.out.println(x);


    }
}