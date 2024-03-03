import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        for(int i=0; i< a.length(); i++){
            if(a.charAt(i)=='0'){
                a = a.substring(0,i)+1+a.substring(i+1);
                break;
            }
            if(!a.contains("0")){
                a = a.substring(0, a.length()-1)+"0";
                break;
            }
        }
        int result = Integer.parseInt(a,2);
        System.out.println(result);
    }
}