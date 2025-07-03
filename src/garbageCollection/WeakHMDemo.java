package garbageCollection;

import java.util.StringTokenizer;
import java.util.WeakHashMap;

public class WeakHMDemo{
    public static void main(String[] args) {
        WeakHashMap<String, Image> map = new WeakHashMap<>();

        //Hash table based implementation of the Map interface, with weak keys. An entry in a WeakHashMap will automatically be removed when its key is no longer in ordinary use

        map.put("img1", new Image("Image 1"));
        map.put("img2", new Image("Image 2"));
        map.put("img3", new Image("Image 3"));

//        System.out.println(map);
//
//        run();
//
//        System.out.println(map);//{img3=Image 3, img1=Image 1, img2=Image 2}
        // no change in above example so let's use System.gc()

        System.out.println(map);
        System.gc();
        run();
        System.out.println(map);//still no change same o/p
        //bcz strings keys are stored in "string pool" cz those are strong references

        // so implement this example we can use new String() for weak references



    }

    public static void run(){
        try{
            System.out.println("App running:  ");
            Thread.sleep(10000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class Image{
    private String name;

    public Image(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}