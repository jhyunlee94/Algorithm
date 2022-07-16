package test;

import java.util.HashSet;
import java.util.Set;

public class Main_2 {
    public static void main(String[] args) {
        //문제 분석
        //1. 로컬네임 + 도메인네임
        //2. 로컬네임에서는 . 무시한다
        //3. 로컬네임에서 + 이후로 나오는 문자열은 무시한다
        //4. 도메인네임에서 .이 들어가면 고유하다

        // 규칙찾기 test.email+james
        // 1. . => Continue로 뺀다
        // 2. + => break로 뺀다
        // 3. Set<String>
        // replace, subString 사용
        Main_2 a = new Main_2();
        String[] emails = {
                "test.email+james@coding.com",
                "test.e.mail+toto.jane@cod.ing.com",
                "testemail+tom@cod.ing.com"};
//        String[] emails = {
//                "test.email+james@coding.com"};
        System.out.println(a.solve_1(emails));
        System.out.println(a.solve_split(emails));
    }


    private int solve_1(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String email : emails) {
            String localName = makeLocalName(email);
            String dName = makeDName(email);

            set.add(localName+"@"+dName);
        }
        return set.size();
    }

    private String makeDName(String email) {
        return email.substring(email.indexOf("@"));
    }

    private String makeLocalName(String email) {
    }

    private int solve_split(String[] emails) {
    }

}
