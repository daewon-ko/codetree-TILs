import java.util.*;
public class Main {
    static final int MAX = 100;
    static int a;
    static int b;
    static int c;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[MAX+1];

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int cnt = 0;
        for(int i =a+3; i<=n; i++){
            for(int j= b+3; j<=n; j++){
                for(int k =c+3; k<=n; k++){
                    cnt++;
                }
            }
        }
        System.out.println(6*6*6 - cnt);
    }
}