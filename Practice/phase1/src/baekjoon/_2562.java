package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class _2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[9];

        for(int i = 0; i < numArr.length; i++){
            numArr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(numArr));
        int max = 0;
        int index = 0;
        for(int i = 0; i<numArr.length;i++){
            if(numArr[i] > max) {
                max = numArr[i];
                index = i + 1;
            }
        }

        System.out.println(max + " " + index);
    }
}
