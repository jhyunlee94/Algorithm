package baekjoon;

import java.util.Scanner;

public class _1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt=0;
        int n = sc.nextInt();
        int temp = n;
        while (true) {
            int left = temp/10;
            int right = temp%10;

            temp = right * 10 + (left+right)%10;
            cnt++;
            if(n == temp) {
                System.out.println(cnt);
                break;
            }
        }
    }
}
