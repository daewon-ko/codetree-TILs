import java.util.*;
public class Main {

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String word = sc.next();
    
        char [] array = new char[n];

        for(int i=0; i<n; i++){
            array[i]=word.charAt(i);
        }   

        int cnt = 0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(array[i] =='C' && array[j] =='O' && array[k]=='W'){
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}