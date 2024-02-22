import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int cnt = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                cnt++;
            }
        }

        if(cnt ==2){
            System.out.println("P");
        }else{
            System.out.println("C");
        }
    }
}