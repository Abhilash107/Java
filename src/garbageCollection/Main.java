package garbageCollection;


import java.lang.ref.WeakReference;

class Phone{
    String brand, model;

    public Phone(String b, String m){
        this.brand = b;
        this.model = m;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}

public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone("Samsung", "S28");
        //this reference is called strong reference
        System.out.println(phone);//garbageCollection.Phone@6d03e736

        phone = null;
        System.out.println(phone);//null

        //here when phone ===> becomes null &
        // there's no pointer pointing to new Phone("Samsung", "S28")
        //so JVM destroys it and known as garbage collection

        //System.gc()//suggests to JVM i.e. totally depends on JVM


        WeakReference<Phone> phoneWeakReference = new WeakReference<>(new Phone("Samsung", "S28"));

        System.out.println(phoneWeakReference.get());//garbageCollection.Phone@568db2f2

        try{
            Thread.sleep(10000);
        }
        catch (InterruptedException e){

        }
        System.out.println(phoneWeakReference.get());//garbageCollection.Phone@568db2f2


        //now we suggest JVM to delete it
        System.gc();

        try{
            Thread.sleep(10000);
        }
        catch (InterruptedException e){

        }
        System.out.println(phoneWeakReference.get());//null


    }
}
