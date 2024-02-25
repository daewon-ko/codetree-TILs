import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for(int i=a; i<=b; i++){
            String num = String.valueOf(i);
            if(num.contains("3") || num.contains("6") || num.contains("9") || logic(i)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    public static boolean logic(int n){
        return n%3==0;

    }
}