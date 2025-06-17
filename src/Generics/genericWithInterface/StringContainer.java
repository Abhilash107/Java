package Generics.genericWithInterface;

//1. explicit version
//public class StringContainer implements Container<String> {
//
//    private String item;
//    @Override
//    public void add(String item) {
//        this.item = item;
//    }
//
//    @Override
//    public String get() {
//        return this.item;
//    }
//}

//2. Generic version, more flexible
public class StringContainer<T> implements Container<T> {

    private T item;

    @Override
    public void add(T item) {
        this.item = item;
    }

    @Override
    public T get() {
        return this.item;
    }
}

