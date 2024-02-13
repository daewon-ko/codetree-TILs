import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int sum= 0;
        double avg = 0;
        for(int i=0; i<n; i++){
            int number = sc.nextInt();
            sum+=number;
            
        }

        avg = Math.round((double)sum/n*10)/10.0;
        Math.round(avg*10/10.0);
        System.out.print(sum+" ");
        System.out.print(avg);
    }
}