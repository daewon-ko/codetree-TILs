import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printRec(n,m);
    }


    public static void printRec(int row, int col){
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(1);
            }
            System.out.println();
        }
    }
}