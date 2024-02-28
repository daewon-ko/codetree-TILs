import java.util.*;
public class Main {

    static int a;
    static int b;

    static int min;
    static int max;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        logic(a,b);



        System.out.print(min+" "+max);

    }


    public static void logic(int a, int b){


        min = Math.min(a,b);
        max = Math.max(a,b);

        min+=10;
        max*=2;

    }
    public static int getMin(int a, int b){
        int min = 0;

        if(a<b){
            min = a;
        }else{
            min = b;
        }
        return min;
    }
    public static int getMax(int a, int b){
        int max = 0;
        if(a<b){
            max = b;
            return max;
        }
        return a;
    }
}