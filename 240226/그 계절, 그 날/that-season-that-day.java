import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        if(isRightYear(y,m,d)){
            if(m>=3 && m<=5){
                System.out.println("Spring");
            }else if(m>=6 && m<=8){
                System.out.println("Summer");
            }else if(m>=9 && m<=11){
                System.out.println("Fall");
            }else{
                System.out.println("Winter");
            }
        }else{
            System.out.println(-1);
        }


    }

    public static boolean isRightYear(int y, int m, int d){ 

        if(isYoon(y) && isRightMonth(m)&& d>=1 && d<=29){   //윤년일때
            return true;
        }else if(!isYoon(y) && isRightMonth(m) && isRightDay(m,d)){   // 윤년이 아닐때
            return true;
        }
        return false;
        

    }

    public static boolean isRightMonth(int m){
        return m>=1 && m<=12;
    }

    public static boolean isRightDay(int m, int d){
        if(m==2 && d>=1 && d<=28){  // 2월일때 But, 윤년이 아님
            return true;
        }

        if(m%2==0 && m!=8 && d>=1 && d<=30){
            return true;
        }

        if(m%2==1 && d>=1 && d<=31 || (m==8 && d>=1 && d<=31)){
            return true;
        }

        return false;

    }

    public static boolean isYoon(int y){
    if(y % 400 == 0){
        return true;  // 4의 배수이면서 100의 배수이면서 400의 배수일 때
    } else if(y % 100 == 0){
        return false;  // 4의 배수이면서 100의 배수이지만 400의 배수가 아닐 때
    } else if(y % 4 == 0){
        return true;  // 4의 배수이면서 100의 배수가 아닐 때
    } else {
        return false;  // 4의 배수가 아닐 때
    }
}

    // public static boolean isYoon(int y){
    //     if(y%4==0){
    //         if(y%100==0){
    //             if(y%400==0){
    //                 return true;
    //             }else{
    //                 return false;
    //             }
    //         }else{
    //             return true;
    //         }
    //     }else{
    //         return false;
    //     }
    // }
}