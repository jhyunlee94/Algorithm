package programers;

import java.util.Scanner;

//직사각형 별찍기
public class Solution1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 0; i < b; i++){ // 행
            for(int j = 0; j < a; j++){ // 열
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

