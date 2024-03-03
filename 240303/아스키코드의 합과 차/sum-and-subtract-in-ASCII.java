import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String word1 = sc.next();
        String word2 = sc.next();

        int word1_num = (int)word1.charAt(0);
        int word2_num = (int)word2.charAt(0);

        if(word1_num> word2_num){
            System.out.println(word1_num+word2_num+" "+(word1_num-word2_num));
        }else{
            System.out.println(word1_num+word2_num+" "+(word2_num-word1_num));
        }


    }
}