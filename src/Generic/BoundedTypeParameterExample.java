package Generic;

// 타입이 제한된 제너릭
public class BoundedTypeParameterExample {
    public static void main(String[] args) {
        // String str = Util.compare("a1", "b"); String은 Number 타입이 아니라서 불가

        int result = Util.compare(10, 20); // int -> Intger로 자동 박싱
        System.out.println(result);

        int result2 = Util.compare(4.5, 3); // double -> Double로 자동 박싱
        System.out.println(result2);


    }

}
