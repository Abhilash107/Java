package OOP.Inheritance.animals;

public class Animal {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void eat(){
        System.out.println("This animal eats food");
    }

    public void say(){
        System.out.println("hehe");
    }

}
