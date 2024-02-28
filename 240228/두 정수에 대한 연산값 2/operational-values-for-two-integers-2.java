import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();


        int min = Math.min(a,b);
        int max = Math.max(a,b);

        min+=10;
        max*=2;



        System.out.print(min+" ");
        System.out.print(max);



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