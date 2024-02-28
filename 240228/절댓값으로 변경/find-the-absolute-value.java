import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            if(a<0){
                a=-(a);
            }
            System.out.print(a+" ");
        }
    }
}