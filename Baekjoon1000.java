import java.io.*;
//import java.util.Scanner;

public class Baekjoon1000 {
    public static void main(String[] args) throws IOException {
        /* 처음 작성한 코드 */
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(a + b);
//        sc.close();
        /* 개선된 코드 _ 속도가 더 빠름 */
        int a = System.in.read()-'0';
        System.in.read();
        int b = System.in.read()-'0';
        System.out.println(a+b);
    }
}
