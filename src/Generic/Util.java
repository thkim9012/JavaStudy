package Generic;

public class Util {
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<>();
        box.set(t);
        return box;
    }

    public static <K,V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        boolean keyCompare = p1.getKey().equals(p2.getKey());
        boolean valueCompare = p1.getValue().equals(p2.getValue());
        return keyCompare && valueCompare;
    }

    // 타입이 제한할때는 extends ~~를 씀, 인터페이도 가능... 안에 메소드는 제한된 상위 타입의 필드와 메소드만 가능..
    // 하위 타입에만 있는 필드와 메소드는 사용 불가
    public static <T extends Number> int compare(T t1, T t2) {
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();
        return Double.compare(v1, v2);
    }
}
