public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int a = 5;
        int b = 6;
        int c = 7;

        int num1, num2, num3;

        num1 = b;
        num2 = c;
        num3 = a;

        b = a; // b = 5;
        c = num1; // c = 6;
        a = num2; // a <- c

        System.out.print(a+"\n"+b+"\n"+c);

    }
}