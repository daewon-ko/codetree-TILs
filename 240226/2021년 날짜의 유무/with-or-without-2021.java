import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int d = sc.nextInt();

        dayCalc(m,d);


    }
    public static void dayCalc(int m, int d){
        if(m==2 && isRightMonth(m) && d>=1 && d<=28){
            System.out.println("Yes");
            return;
        }
        if(m%2==0 && isRightMonth(m) && m!=2 && (d>=1 && d<=31)){
            System.out.println("Yes");
            return;
        }

        if(m%2!=0 && isRightMonth(m) && d>=1 && d<=30){
            System.out.println("Yes");
            return;
        }

        System.out.println("No");


    }

    public static boolean isRightMonth(int m){
        return m>=1 && m<=12;
    }
}