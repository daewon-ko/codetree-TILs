import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = 20;
        int cnt = 0;
        double sum = 0;

        while(true){
            n = sc.nextInt();
            if(!(n>=20 && n<30)){
                break;
            }
            sum+=n;
            cnt++;
        }
        System.out.printf("%.2f", (double)sum/cnt);
    }
}