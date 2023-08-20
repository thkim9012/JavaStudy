package generic;

public class ProductExample {

    public static void main(String[] args) {
        Product<Car, Integer> product = new Product<>();
        Car car = new Car();
        car.setModel("장난감");
        product.setKind(car);
        product.setModel(39023);

        System.out.println(product.getKind().getModel());
        System.out.println(product.getModel());

    }
}

class Car {
    public Car(){};
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
