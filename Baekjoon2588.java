import java.util.Scanner;
// 처리속도 = 212ms
public class Baekjoon2588 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int a = in.nextInt(); //472
        String b = in.next(); //385(문자열로 입력받음)

        for(int i = 2; i >= 0; i-- ) { // 뒷자리부터 하나씩
            int result = a * (b.charAt(i)-'0'); // 문자열을->문자->숫자로 변환 후 곱셈
            System.out.println(result);
        }
        int hap = a * Integer.parseInt(b); //문자열 b를 숫자로 변환
        System.out.println(hap);

        in.close();
    }
}

