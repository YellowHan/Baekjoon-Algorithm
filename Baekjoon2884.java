import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int H = Integer.parseInt(st.nextToken()); // 시
        int M = Integer.parseInt(st.nextToken()); // 분

        // 45분 기준

        if(M<45) { // 45분 미만일 경우
            H = H - 1; // H(시)에서 -1
            M += 15; // M(분)에 +15(Ex:44분이면+15=59분)

            if(H<0) { // 자정 0:0, H(시)는 0~23까지 표현
                H += 24; // H(시)가 -1이면(23시), 24를 더해서 양수 23으로 표현
            }
        }

        else M -= 45; // 45분이상이면 -45

        System.out.println(H + " " + M);
    }
}
