package OOP.Static;

public class Test {
    public static void main(String[] args) {

        Student std1 = new Student();
        Student std2 = new Student();
        Student std3 = new Student();
        Student std4 = new Student();
        //System.out.println(std1.getName());

        System.out.println(Student.count);//class.staticMebmer
        System.out.println(Student.school);//class.staticMebmer
        Student.getCount();//class.staticMethod

        //sum(1, 2);
        //Non-static method 'sum(int, int)' cannot be referenced from a static context

        //but when obj of test is created then we can access it, let's see
        Test test = new Test();
        test.sum(1, 2);

        //or for direct calling use static keyword
        //Static method can't use non-static data member or call non-static method directly
        //this and super can't be used in static context


        //now static block example
        Student.getCount();

        //Hello
        //4

        //second example -> hello , 10 + 4


    }

    public int sum(int a, int b){
        return a + b;
    }
}
