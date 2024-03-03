import java.util.*;
public class Main {
    static int MIN = Integer.MAX_VALUE;
    static List<List<Integer>> graph;
    public static void main(String[] args) {
               // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        graph = new ArrayList<List<Integer>>();

        for(int i=0; i<n; i++){

                List<Integer> coordinates = new ArrayList<>();
    coordinates.add(Integer.valueOf(sc.nextInt()));
    coordinates.add(Integer.valueOf(sc.nextInt()));
    graph.add(coordinates);


        }
        
        List<Integer> start=graph.get(0);
        List<Integer> end = graph.get(n-1);
        int firstX = start.get(0);
        int firstY = start.get(1);

        int lastX = end.get(0);
        int lastY = end.get(1);

        for(int i=1; i<n-1; i++){
            int sum = 0; 
            List<Integer> place =graph.get(i);
            int x= place.get(0);
            int y = place.get(1);
            sum = Math.abs(x-firstX) +Math.abs(y-firstY)
            +Math.abs(x-lastX) + Math.abs(y-lastY);

            MIN = Math.min(MIN, sum);

        }
        System.out.println(MIN);


    }
}