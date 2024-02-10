import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        List<Integer> list = new ArrayList();

        list.add(a);
        list.add(b);
        list.add(c);

        Collections.sort(list);

        System.out.println(list.get(1));

    }
}