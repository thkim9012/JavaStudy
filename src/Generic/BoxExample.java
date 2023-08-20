package Generic;

public class BoxExample {

    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.set("Hi");

        System.out.println(box.get());
    }
}
