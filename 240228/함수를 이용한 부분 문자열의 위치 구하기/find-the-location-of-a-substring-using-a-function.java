import java.util.*;

public class Main {
    static String input;
    static String object;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        object = sc.nextLine();

        logic(input, object);
    }

    public static void logic(String input, String object) {
        if (input.contains(object)) {
            char firstChar = object.charAt(0);

            for (int i = 0; i < input.length() - object.length() + 1; i++) {
                if (firstChar == input.charAt(i)) {
                    boolean match = true;

                    for (int j = 0; j < object.length(); j++) {
                        if (input.charAt(i + j) != object.charAt(j)) {
                            match = false;
                            break;
                        }
                    }

                    if (match) {
                        System.out.println(i);
                        return;
                    }
                }
            }
        } else {
            System.out.println(-1);
        }
    }
}