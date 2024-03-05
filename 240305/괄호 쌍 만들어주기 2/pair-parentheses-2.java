import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int n  = input.length();
        int cnt = 0; 

        for(int i = 0; i<n; i++){
            for(int j=i+2; j<n-1; j++){

                        if(input.charAt(i)=='(' && input.charAt(i+1)=='('
                        && input.charAt(j)==')' && input.charAt(j+1)==')'){
                            cnt++;
                        }
                    
                }
        }

        System.out.println(cnt);
    }
}