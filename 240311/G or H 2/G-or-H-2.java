import java.util.*;
public class Main {

    static final int MAX_NUM = 100;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] alphabets= new int [MAX_NUM+1];


        //초기화

        for(int i=0; i<n; i++){
            int index = sc.nextInt();
            char alphabet =sc.next().charAt(0);
            if(alphabet == 'G'){
                alphabets[index] =1;
            }else{
                alphabets[index] = 2;
            }
        }


        int max = 0;

        for(int i=0; i<=MAX_NUM; i++){
            for(int j = i+1; j<=MAX_NUM; j++){

                if(alphabets[j] ==0 || alphabets[i] ==0){
                    continue;
                }

                int cntH = 0;
                int cntG = 0;
               
               for(int k=i; k<=j; k++){
                if(alphabets[k]==1){
                    cntG++;
                }
                if(alphabets[k]==2){
                    cntH++;
                }
               }

               if(cntG==0 || cntH==0 || cntG== cntH){
                max = Math.max(max, j-i);
               }

                }
            }
        System.out.println(max);
    }
}

//     public static boolean onlyContainG(String word){
//         for(int i=0; i<word.length(); i++){
//             if(word.charAt(i)!='G'){
//                 return false;
//             }
//         }
//         return true;
//     }

//         public static boolean onlyContainH(String word){
//         for(int i=0; i<word.length(); i++){
//             if(word.charAt(i)!='H'){
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static boolean exactCount(String word){
//         int cnt_g = 0;
//         int cnt_h = 0;
//         for(int i=0; i<word.length(); i++){
//             if(word.charAt(i)=='G'){
//                 cnt_g++;
//             }else{
//                 cnt_h++;
//             }

//         }

//         if(cnt_g == cnt_h){
//             return true;
//         }
//         return false;
//     }
// }