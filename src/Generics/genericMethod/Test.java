package Generics.genericMethod;

enum Operation{
    ADD, SUBTRACT, MULTIPLY, DIVIDE;

    public<T extends Number> double apply(T a, T b){

        switch (this){
            case ADD:
                return a.doubleValue() + b.doubleValue();
            case SUBTRACT:
                return a.doubleValue() - b.doubleValue();

            case MULTIPLY:
                return a.doubleValue() * b.doubleValue();

            case DIVIDE:
                return a.doubleValue() / b.doubleValue();

            default:
                throw new AssertionError("Unknown operation: "+ this);
        }
        // no need of break as each case emds with a return statement
    }

}

public class Test {
    public static void main(String[] args) {
        double add = Operation.ADD.apply(10, 20);
        System.out.println(add);
    }
}
