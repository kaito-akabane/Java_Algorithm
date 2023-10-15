import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        Deque<Integer> q = new ArrayDeque<>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int cntQ = 0;
        for(int i=0;i<n;i++) {
            if(Integer.parseInt(st.nextToken())==0) {
                q.addLast(Integer.parseInt(st2.nextToken()));
                cntQ++;
            }
            else st2.nextToken();
        }
        
        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++) {
            q.addFirst(Integer.parseInt(st.nextToken()));
            sb.append(q.pollLast()).append(" ");
        }
        System.out.println(sb);
    }
}