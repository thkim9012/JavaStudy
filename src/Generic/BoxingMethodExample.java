package Generic;

public class BoxingMethodExample {
    public static void main(String[] args) {
        Box<Integer> box1 = Util.<Integer>boxing(100); // 명시적으로 타입 파라미터를 선언
        int intValue = box1.get();

        Box<String> box2 = Util.boxing("홍길동"); // 컴파일러에게 타입 파라미터 추론을 맡김
        String strValue = box2.get();

        System.out.println(intValue);
        System.out.println(strValue);
    }
}
