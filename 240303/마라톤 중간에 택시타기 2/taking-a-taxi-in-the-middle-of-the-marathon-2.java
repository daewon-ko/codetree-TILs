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
    
        for(int i=1; i<n-1; i++){
            int sum = 0; 
            List<Integer> placeBefore = graph.get(i-1);
            List<Integer> placeAfter = graph.get(i+1);


            int beforeX = placeBefore.get(0);
            int beforeY = placeBefore.get(1);

            int afterX = placeAfter.get(0);
            int afterY = placeAfter.get(1);


            for(int j=0; j<n; j++){
                List<Integer> place = graph.get(j);

                if(j==i){
                    continue;
                }

                int x = place.get(0);
                int y = place.get(1);

                sum+=Math.abs(beforeX - x)+Math.abs(beforeY-y);

                beforeX = x;
                beforeY = y;
            }


            MIN = Math.min(MIN, sum);

        }
        System.out.println(MIN);


    }
}