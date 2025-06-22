package collectionFramework.list.copyOnWriteArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {

        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        // "Copy on Write" means that whenever a write operation
        // Like adding or removing an element
        // instead of directly modifying the existing list
        // a new copy of the list is created, and the modification is applied to that copy
        // This ensures that other threads reading the list while it’s being modified are unaffected.




        //List<String> stringList = new ArrayList<>();//error
        List<String> stringList = new CopyOnWriteArrayList<>();
        stringList.add("Ballon d'Or");
        stringList.add("The Best FIFA Men's Player");
        stringList.add("UEFA Men's Player of the Year");
        stringList.add("Kopa Trophy");

        for(String item: stringList){
            System.out.println(item);

            if(item.equals("Kopa Trophy")){
                stringList.add("FIFA World Cup Golden Ball");
                System.out.println("Added to the achievement section");
            }
        }

        System.out.println("Awards: "+ stringList);

        // Never modify a collection while using an enhanced for loop.(IMP)


    }
}
