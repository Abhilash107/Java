package Generics.boundedTypeParameter;

interface Printable{
    void print();
}

class MyNumber extends Number implements Printable  {
    private final int value;

    public MyNumber(int value){
        this.value = value;
    }

    @Override
    public void print() {
        System.out.println("My number: "+ value);
    }

    public int getValue() {
        return value;
    }

    @Override
    public int intValue() {//  extended property
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

}


class Boxx<T extends Number & Printable>{
    //here it implements Printable(not extended)
    // 1st one is class and 2nd one is an interface

    private T item;

    public Boxx(T item) {
        this.item = item;
    }

    public void display(){
        item.print();
        //System.out.println(this.item);//Generics.boundedTypeParameter.MyNumber@378bf509
    }

    public T getItem(){
        return item;
    }
}


public class Main {
    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(12);

        Boxx<MyNumber> box = new Boxx<>(myNumber);

        box.display();

    }
}




// without interace Printable
//package Generics.boundedTypeParameter;
//
//interface Printable{
//    void print();
//}
//
//class MyNumber extends Number  {
//    private final int value;
//
//    public MyNumber(int value){
//        this.value = value;
//    }
//
//    //@Override
//    public void print() {
//        System.out.println("My number: "+ value);
//    }
//
//    public int getValue() {
//        return value;
//    }
//
//    @Override
//    public int intValue() {//  extended property
//        return 0;
//    }
//
//    @Override
//    public double doubleValue() {
//        return 0;
//    }
//
//    @Override
//    public float floatValue() {
//        return 0;
//    }
//
//    @Override
//    public long longValue() {
//        return 0;
//    }
//
//}
//
//
//class Boxx<T extends MyNumber>{
//
//    private T item;
//
//    public Boxx(T item) {
//        this.item = item;
//    }
//
//    public void display(){
//        item.print();
//        //System.out.println(this.item);
//    }
//
//    public T getItem(){
//        return item;
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args) {
//        MyNumber myNumber = new MyNumber(12);
//
//        Boxx<MyNumber> box = new Boxx<>(myNumber);
//
//        box.display();
//
//    }
//}

