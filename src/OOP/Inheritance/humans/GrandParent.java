package OOP.Inheritance.humans;

public class GrandParent {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    private boolean hasSuperPowers;

    //2. concept: Now let us assume
    public GrandParent(int age, String n) {
        this.name = n;
        this.age = age;
        hasSuperPowers = false;
        System.out.println("GrandParent called...");
    }


    public boolean hasSuperPowers() {
        return hasSuperPowers;
    }



}
