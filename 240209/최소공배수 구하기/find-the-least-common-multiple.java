import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        if(a<b) {
            int temp;
            temp = a;
            a =b;
            b = temp;
        }
        int gcd = gcd(a, b);

        int result = a*b / gcd;

        System.out.println(result);


        


    }
    static int gcd(int a, int b){
        if(a%b==0){
            return b;
        }
        return gcd(b, a%b);
    }

}