import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for(int i=1;i<=t;i++){
            for(int j=i;j<t;j++){
                bw.write(" ");
            }
            for(int k=1;k<=i;k++){
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}