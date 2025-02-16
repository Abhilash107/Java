package AccessModifier.school;

public class School {

    private static School school;//ref of this clas

    private School(){}

    public static School getInstance(){
        if(school == null){
            school = new School();
        }

        return school;
    }


}
