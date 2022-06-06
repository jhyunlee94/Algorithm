package test;

import java.util.HashSet;
import java.util.Set;

public class Main_1 {
    public static void main(String[] args) {
          String jewels = "aA", stones = "aAAbbbb";
//        String jewels = "zz", stones = "ZZ";
        System.out.println(solve(jewels,stones));
    }

    public static int solve(String jew, String stones){
        //Character로 하는게 a, A 따로 하나하나 담아야하니까!!
        Set<Character> set = new HashSet<>();

        char[] jewArr = jew.toCharArray();

        for(int i = 0; i < jewArr.length; i++){
            set.add(jewArr[i]); //a, A
        }
        int count = 0;
        char[] stoneArr = stones.toCharArray();
        for(int i = 0; i < stoneArr.length; i++){
            if(set.contains(stoneArr[i])){
                //set.contains 있는지를 true, false 로 존재 여부 리턴
                count++;
            }
        }
        return set.size();
    }
}
