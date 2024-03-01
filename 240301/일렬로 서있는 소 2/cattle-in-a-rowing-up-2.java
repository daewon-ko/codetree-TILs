import java.util.*;
public class Main {
    static int [] a;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        a = new int[n+1];

        for(int i=1; i<=n; i++){
            a[i] = sc.nextInt();

        }

        int cnt = 0; 

        for(int i=1; i<=a.length; i++){
            for(int j=i+1; j<=a.length; j++){
                for(int k=j+1; k<=a.length-1; k++){
                    if(i<j && j<k  && (a[i]<=a[j] && a[j] <=a[k]))
                        cnt++;  
                }
            }            
        }
        System.out.println(cnt);
    }
}