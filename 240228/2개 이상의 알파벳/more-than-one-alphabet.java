import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        boolean result = isDouble(word);
        if(result){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
    public static boolean isDouble(String word){
        for(int i=0; i<word.length(); i++){
            int cnt = 0; 
            for(int j=0; j<word.length(); j++){
                if(word.charAt(i)!= word.charAt(j) && i!=j){
                    cnt++;
                }
            }
            if(cnt>=2){
                return true;
            }
        }

        return false;
    }
}