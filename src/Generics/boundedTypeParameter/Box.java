package Generics.boundedTypeParameter;

public class Box<T extends Number>{
    private T value;

    public T getValue(){
        return value;
    }

    public void setValue(T val){
        this.value = val;
    }
}
