import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 처리속도 = 124ms
public class Baekjoon2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();
        for (int i = 2; i >= 0; i--) { // 뒷자리부터 하나씩
            int result = a * (b.charAt(i) - '0'); // 문자열을->문자->숫자로 변환 후 곱셈
            System.out.println(result);
        }
        int hap = a * Integer.parseInt(b); //문자열 b를 숫자로 변환
        System.out.println(hap);
    }
}

