package OOP.Static;

public class School {

    private static School school = new School();//creating constructor here

    private School(){

    }

    public static School getInstance(){
        return school;
    }
}
