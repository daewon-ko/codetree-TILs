import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int cnt_three=0;
        int cnt_five = 0;
        for(int i=0; i<10; i++){
            int n =sc.nextInt();
            if(n%3==0){
                cnt_three++;
            }
            if(n%5==0){
                cnt_five++;
            }

        }
        System.out.print(cnt_three+" "+cnt_five);
    }
}