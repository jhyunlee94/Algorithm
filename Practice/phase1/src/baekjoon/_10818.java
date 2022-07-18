package baekjoon;

import java.sql.Array;
import java.util.*;

public class _10818 {
    public static void main(String[] args) {
        //N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] t = new int[num];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < t.length; i++){
            num = sc.nextInt();
            list.add(num);
        }
        Collections.sort(list);
        int a = t.length-1;

        System.out.println(list.get(0) +" " +list.get(a));
    }
    /*public static void main(String[] args) {
        //N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] t = new int[num];

        for (int i = 0; i < t.length; i++){
            num = sc.nextInt();
            t[i] = num;
        }
        Arrays.sort(t);
        int a = t.length-1;

        System.out.println(t[0] + " " + t[a]);
    }*/
}
