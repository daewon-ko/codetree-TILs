import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(isYoon(n));

    }
    public static boolean isYoon(int n){
        if(n%4!=0){
            return false;   // 4로 나눠떨어지지않으면 평년
        }
        if(n%100==0 && n%400!=0){
            return false;    // 100으로 나눠떨어지고 400으로 나눠떨어지지않ㅎ으면 평년
        }
        return true;
    }
}