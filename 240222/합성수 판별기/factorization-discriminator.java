import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        // 1보다 큰 자연수 중 소수가 아닌수 => 합성수
        // 소수는 어떻게 표현하지? -> 자기 자신과 숫자 1만 약수로 갖는 수
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int cnt = 0;
        for(int i=n; i>0; i--){
            if(n%i==0){
                cnt++;
            }
        }

        if(cnt ==2){    // cnt ==2 면 소수 
            System.out.println("N");
        }else{
            System.out.println("C");
        }
        
    }
}