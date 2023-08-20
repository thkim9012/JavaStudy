package Generic;

import java.util.HashMap;
import java.util.Map;

public class CompareMethodExample {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "사과");
        Pair<Integer, String> p2 = new Pair<>(1, "사과");

        // 파라미터 타입을 명시적으로 지정
        boolean result1 = Util.<Integer, String>compare(p1, p2);
        if (result1) {
            System.out.println("논리적으로 동일한 객체입니다.");
        } else {
            System.out.println("논리적으로 동등하지 않은 객체입니다.");
        }

        Pair<String, String> p3 = new Pair<>("user1", "홍길동");
        Pair<String, String> p4 = new Pair<>("user2", "홍길동");

        // 파라미터 타입을 추정
        boolean result2 = Util.compare(p3, p4);
        if (result2) {
            System.out.println("논리적으로 동일한 객체입니다.");
        } else {
            System.out.println("논리적으로 동등하지 않은 객체입니다.");
        }



    }
}
