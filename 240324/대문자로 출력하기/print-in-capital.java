import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<input.length(); i++){
            char c = input.charAt(i);
            if(c>='A'&& c<= 'Z'){
                sb.append(String.valueOf(c));
            }else if(c>='a' && c<= 'z'){
                
                sb.append(String.valueOf((char)(c-'a'+'A')));
            }

        }
        System.out.println(sb.toString());
        
    }
}