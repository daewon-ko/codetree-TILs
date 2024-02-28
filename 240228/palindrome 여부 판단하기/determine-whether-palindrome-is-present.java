import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output=reverseWord(input);

        if(input.equals(output)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

    public static String reverseWord(String input){
        String word = "";
        int size = input.length();
        for(int i=size-1; i>=0; i--){
            char c=input.charAt(i);
            String oneChar = String.valueOf(c);
            word +=oneChar;
        }
        return word;

    }
}