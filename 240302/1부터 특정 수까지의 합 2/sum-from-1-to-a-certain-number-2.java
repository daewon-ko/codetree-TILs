import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = func(n);
        System.out.println(result);



    }

    public static int func(int n){
        if(n==1){
            return 1;
        }
        return  n + func(n-1);

    }
}