import java.util.*;
public class Main {
        public static void main(String[] args) {
            // 여기에 코드를 작성해주세요.
            Scanner sc = new Scanner(System.in);
            String a = sc.next();
            String b = sc.next();

            Queue<String> queue = new LinkedList<>();


            // Queue에 추가
            // 역순으로 추가한다.
            for(int i=a.length()-1; i>=0; i--){
                queue.add(String.valueOf(a.charAt(i)));
            }
            int cnt = 0;

            while(!a.equals(b)){
                String firstValue = queue.poll();


                if(firstValue != null){
                    queue.add(firstValue);
                }

                cnt++;


                StringBuilder sb = new StringBuilder();
                Queue<String> temp = new LinkedList<>(queue);

                String s;

                while(( s =temp.poll())!= null){
                    sb.append(s);
                }


                String result = sb.reverse().toString();
                a = result;

                if (cnt > a.length()) {
                    break;
                }


            }

            if (cnt > a.length()) {
                System.out.println(-1);
            }else{
                System.out.println(cnt);    
            }
            
            

        }
}