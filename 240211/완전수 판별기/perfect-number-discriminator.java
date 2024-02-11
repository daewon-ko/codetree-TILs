import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for(int i=1; i<=n; i++){

            for(int j =n; j>=1; j--){
                if(j*i ==n && j!=n){
                    list.add(j);
                }
            }
        }

        int sum = 0;

        for(int i=0; i<list.size(); i++){
            sum+=list.get(i);
        }

        if(sum==n){
            System.out.println("P");
        }else{
            System.out.println("N");

        }
    }
}