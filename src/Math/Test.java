package Math;

public class Test {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println(Math.max(a,b));
        System.out.println(Math.min(a,b));
        System.out.println(Math.abs(a * -1));
        System.out.println(Math.ceil(9.7));//10.0
        System.out.println(Math.floor(9.7));//9.0
        System.out.println(Math.round(9.7));//10
        System.out.println(Math.sqrt(100));//10.0
        System.out.println(Math.pow(10, 2));//100.0
        System.out.println(Math.log(10));//2.302585092994046
        System.out.println(Math.log10(10));//1.0
        System.out.println(Math.random());

        System.out.println(Math.PI);//141592653589793
        System.out.println((int)(Math.random() * 11));
    }
}
