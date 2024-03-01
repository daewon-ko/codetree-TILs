import java.util.*;
public class Main {
    static char [] arr;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        String input = sc.nextLine();
        
        for(int i=0; i<input.length(); i++){
            arr = input.toCharArray();
        }

        int cnt = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                if(arr[i] == '(' && arr[j]==')'){
                        cnt++;
                    }               
            }
        }
        System.out.println(cnt);

    }
}