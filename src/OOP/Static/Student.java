package OOP.Static;

public class Student {

    public static int count = 0;

    static{
        count = 10;
        System.out.println("Hello");
    }
    public static String school = "DAV";

    public Student(){
        count++;
    }

    //Encapsulation
    private int id;
    private String name = "eheh";
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    //This method can be called without creating any instance
    public static void getCount(){
        System.out.println("Total students: "+ count);
        //System.out.println("Total students: "+ age);//Non-static field 'age' cannot be referenced from a static context
    }
}

