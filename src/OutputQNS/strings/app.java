package OutputQNS.strings;

public class app {
    public static void main(String[] args) {
//        String s = ""Hello"";
//        String t = ""world"";// error
        String s = "Hello";
        String t = "world";
        String u = s +" " + t;
        System.out.println(u);

//        String s1 = ""Hello\0world"";//error
        String s2 = "Hello\0world";
        //\0 does not terminate the string in Java. The string length will still be 11.
        System.out.println(s2);//Hello world

        String a = "";
        a = a + 'a';

        System.out.println(a);

        a += 'a';
        System.out.println(a);









    }

}
