package Generic.Lambda;

public class MyFunctionInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface fi;

        fi = () -> {
            String str = "method";
            System.out.println(str);

        };
        fi.method();

        fi = () -> System.out.println("실행문이 하나면 중괄호 생략가능");
        fi.method();

        MyFunctionInterface2 fi2;

        fi2 = (x) -> {
            int result = x *5;
            System.out.println(result);
            return result;
        };
        fi2.method(3);

        fi2 = (x) -> x;

        int i = fi2.method(123);
        // 리턴문만 있으면 생략 가능(1줄로 돼있으면)
        System.out.println(i);
    }
}
