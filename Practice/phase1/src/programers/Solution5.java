package programers;

public class Solution5 {
    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        System.out.println(solution5.solution(10));
    }

    private boolean solution(int x) {

        String[] temp = String.valueOf(x).split("");

        int sum = 0;

        for(int i = 0; i < temp.length; i++){
            sum += Integer.parseInt(temp[i]);
        }

        if(x%sum == 0){
            return true;
        } else {
            return false;
        }
    }
}
