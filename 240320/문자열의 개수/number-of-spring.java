import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        String input;
        int cnt = 0;
        List<String> list = new ArrayList<>();
        while(!(input = sc.next()).equals("0")){
            cnt++;
            
            
            if(cnt%2==1){
                list.add(input);
            }

        }
        
        System.out.println(cnt);
        for(String s : list){
            System.out.println(s);
        }
    }
}