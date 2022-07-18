package baekjoon;

import java.util.Scanner;

public class _2577 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int value = (in.nextInt() * in.nextInt() * in.nextInt());
        String str = Integer.toString(value);
        in.close();
//        int count = 0;// 여기다 넣으면 초기화가 안됨
        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if ((str.charAt(j) - '0') == i) { // 문자로 바꾼 str을 charAt을 써서 하나하나 i 값과 비교
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
