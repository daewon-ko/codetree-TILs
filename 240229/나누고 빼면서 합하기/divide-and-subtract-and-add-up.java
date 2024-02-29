import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m =sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }


        int sum = 0;


        while(m>0){
            if(m%2==0){
                sum+=list.get(m-1);
                m/=2;
            
            }else{
                sum+=list.get(m-1);
                m-=1;
            }
        }

        System.out.println(sum);


    }
}