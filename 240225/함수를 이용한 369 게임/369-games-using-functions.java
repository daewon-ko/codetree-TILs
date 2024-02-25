import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for(int i=a; i<=b; i++){
            if(isContain369(i) || i%3==0){
                cnt++;
            }
        }
    System.out.println(cnt);
    }
    public static boolean isContain369(int n){

        while(n>0){
            if(n%10 ==3 || n%10 ==6 || n%10 ==9){
                return true;
            }
            n/=10;
        }
        return false;
    }
}