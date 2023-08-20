package generic.lambda;

public class UsingThis {
    public int outterField = 10;

    class Inner {
        int innerField = 20;

        void method() {
            MyFunctionalInterface fi = () -> {
                System.out.println("outerField : "+outterField);
                System.out.println("outerField : "+UsingThis.this.outterField); // 바깥객체 참조위해서는 클래스명.this 사용
                System.out.println("innerField : "+innerField);
                System.out.println("innerField : "+this.innerField); // 람다식 내부에서 this는 Inner객체를 참조
            };
            fi.method();
        }

    }
}
