import java.util.*;
public class Main {
    static int a1, b1, c1, a2, b2, c2;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        a1 = sc.nextInt();
        b1 = sc.nextInt();
        c1 = sc.nextInt();

        a2 = sc.nextInt();
        b2 = sc.nextInt();
        c2 = sc.nextInt();

        int cnt = 0;

        for(int i=1; i<=n; i++){
            
            for(int j=1; j<=n; j++){
                for(int k=1; k<=n; k++){
                  if((Math.abs(a1-i)<=2 || Math.abs(a1-i)>=n-2) &&  (Math.abs(b1-j)<=2 || Math.abs(b1-j)>=n-2) 
                  && (Math.abs(c1-k)<=2 || Math.abs(c1-k)>=n-2)){
                    cnt++;
                  }else if(
                    (Math.abs(a2-i)<=2 || Math.abs(a2-i)>=n-2) && (Math.abs(b2-j)<=2 || Math.abs(b2-j)>=n-2) 
                    && (Math.abs(c2-k)<=2 || Math.abs(c2-k)>=n-2)){
                        cnt++;
                    }
                  
                }
            }
        }
        System.out.println(cnt);
        


    }
}