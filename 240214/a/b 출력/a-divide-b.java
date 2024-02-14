import java.util.*;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        BigDecimal a = sc.nextBigDecimal();
        BigDecimal b = sc.nextBigDecimal();


        BigDecimal result = a.divide(b, 20, BigDecimal.ROUND_HALF_UP);

        System.out.println(result);


    }
}