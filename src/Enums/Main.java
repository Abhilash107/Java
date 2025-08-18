package Enums;

public class Main {
    public static void main(String[] args) {
//        System.out.println(DayClass.MONDAY);
//        System.out.println(Day.SUNDAY);

        Day day = Day.TUESDAY;// 7 times
        //The enum constructor runs 7 times because you have 7 constants, and each constant is an object.
        //The constructor executes once when each constant is created during class loading.

        System.out.println(day.getLower());
        System.out.println(day.ordinal());//6
        System.out.println(day.name());
        System.out.println(Day.valueOf("MONDAY"));//searches from the list
        //System.out.println(Day.valueOf("MONDAY"));// Error: No enum constant Enums.Day.MONDAY

        Day[] value = Day.values();
        for (Day i: value) System.out.print(i + " ");
        System.out.println();

        day.display();

        // Extra use cases:

//        switch (day) {
//            case MONDAY: {
//                System.out.println("It's Monday, start of the week!");
//                break;
//            }
//            case TUESDAY: {
//                System.out.println("It's Tuesday, keep going!");
//                break;
//            }
//            case WEDNESDAY: {
//                System.out.println("It's Wednesday, midweek!");
//                break;
//            }
//            case THURSDAY: {
//                System.out.println("It's Thursday, almost there!");
//                break;
//            }
//            case FRIDAY: {
//                System.out.println("It's Friday, weekend is near!");
//                break;
//            }
//            case SATURDAY: {
//                System.out.println("It's Saturday, time to relax!");
//                break;
//            }
//            case SUNDAY: {
//                System.out.println("It's Sunday, enjoy your day!");
//                break;
//            }
//            default: {
//                System.out.println("Invalid day.");
//            }
//        }
//
//        //new syntax
//        switch (day){
//            case MONDAY -> {
//                System.out.println("Monday");
//                break;//'break' statement is unnecessary
//            }
//            case TUESDAY -> System.out.println("Tuesday");
//        }


    }
}
