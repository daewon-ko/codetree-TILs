import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        List<Integer> a1 = new ArrayList<>();

        for(int i=0; i<n1; i++){
            a1.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        List<Integer> a2 = new ArrayList<>();
        for(int i=0; i<n2; i++){
            a2.add(Integer.parseInt(st.nextToken()));
        }

        isInclude(a1, a2);
        
    }
    public static void isInclude(List<Integer> a1, List<Integer> a2){
        int cnt = 0;
        int standard = a2.size();

        for(int i=0; i<a1.size(); i++){
            for(int j=0; j<a2.size(); j++){
                if(a1.get(i).equals(a2.get(j))){
                    cnt++;
                    break;
                }
            }
        }

        if(cnt == standard){
            System.out.println("Yes");
            return;
        }
        System.out.println("No");

    }
}