import java.util.Scanner;

public class Main {
    static int a,b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        func(i,j);
        System.out.print(a + " " + b);
    }
    static void func(int i, int j){
        if(i>j){
            b = j+ 10;
            a = i * 2;
        }else{
            a = i + 10;
            b = j * 2;
        }
    }
}