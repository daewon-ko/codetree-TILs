import java.util.*;
public class Main {
    static int sum;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        sum = 0;
        primeNumber(a,b);
        System.out.println(sum);
    }
    public static void primeNumber(int a, int b){
        for(int i=a; i<=b; i++){
            int cnt = 0; 
            for(int j=2; j<i; j++){
                if(i%j==0){
                   cnt++;
                }
            }
            if(cnt==0){
                sum+=i;
            }
        }
    }
}