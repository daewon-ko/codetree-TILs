import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int result =greatDivider(n,m);
        System.out.println(result);
    }

    public static int greatDivider(int n, int m){
        int maxResult = 0;
        int min=Math.min(n,m);
        for(int i=1; i<=min; i++){
            if(n%i==0 && m%i==0){
                maxResult =Math.max(maxResult, i);
            }
        }
        return maxResult;
        
    }
}