package collectionFramework.map.hashMap;

import java.util.HashMap;
import java.util.Objects;

class Person{
    private String name;

    private int id;

    public Person(String name, int id){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ID: " + id + " NAME: "+ name;
    }

    @Override
    public int hashCode() {
        //return super.hashCode();

        //re-writing
        return Objects.hash(name, id);
    }

    @Override
    public boolean equals(Object obj) {
        // re-writing if obj are same
        if(this == obj) return true;

        if(obj == null) return false;

        Person other = (Person) obj;

        //checking
        return id == other.getId() && Objects.equals(name, other.getName());
    }
}

public class HashCodeAndEqualMethod {

    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();

        Person p1 = new Person("Alice", 1);
        Person p2 = new Person("Bob", 2);
        Person p3 = new Person("Alice", 1);// same as p1

        //BUT hashCode is generated considering the memory Address
        // and as "new" keyword is used for p1 and p3 hence their memory address isn't smae
        // so -> their hashCode is also not same and have different index

        map.put(p1, "Engineer");//hashCode1 --> index1
        map.put(p2, "Designer");//hashCode2 --> index2
        map.put(p3, "Manager");//hashCode3 --> index3

        System.out.println(map.size());//3
        System.out.println( map.get(p1));//Engineer
        System.out.println( map.get(p3));//Manager

        System.out.println();

        //after re-writing the hashCode and equals method
        System.out.println(map.size());//2
        System.out.println( map.get(p1));//Manager
        System.out.println( map.get(p3));//Manager


        //ex - 2

        HashMap<String, Integer> map1 = new HashMap<>();

        map1.put("A", 10);//hashcode1 --> index1
        map1.put("B", 20);////hashcode2 --> index2
        map1.put("A", 30);// here hashcode1 --> index1 --> equals() --> replace

        System.out.println(map1.size());// 2
        System.out.println(map1.get("A"));// 30 --> replaces 10

        System.out.println(p1);
        System.out.println(p3);




    }
}
