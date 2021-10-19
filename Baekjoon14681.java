import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        if(0<x&&0<y)
            System.out.println("1");
        else if(0>x&&0<y)
            System.out.println("2");
        else if(0>x&&0>y)
            System.out.println("3");
        else if(0<x&&0>y)
            System.out.println("4");
    }
}
