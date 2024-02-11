import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnt_room = 0;
        int cnt_gate = 0;
        int cnt_bath = 0;

        for(int i =1; i<=n; i++){

            if(i%2==0 && i%3!=0 && i%12!=0){
                cnt_room++;
            }else if(i%3==0 && i%12!=0){
                cnt_gate++;
            }else if(i%12==0){
                cnt_bath++;
            }
        }

        System.out.println(cnt_room+" "+cnt_gate+" "+cnt_bath);
    }
}