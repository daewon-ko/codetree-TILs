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
        for(int i =1; i<=n; i++){
            for(int j=1; j<=n; j++){
                for(int k =1; k<=n; k++){
                   if(Math.abs(i-a)>=3 && Math.abs(j-b)>=3 && Math.abs(k-c)>=3){
                        cnt++;
                   }
                }
            }
        }
        System.out.println((n*n*n)-cnt);
    }
}