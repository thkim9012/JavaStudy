package generic;

public class Product<T, M> {

    private T kind;
    private M model;

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }

    public T getKind() {
        return kind;
    }

    public void setKind(T kind) {
        this.kind = kind;
    }
}
