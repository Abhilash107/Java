package OutputQNS.oops;

public class q8 {
    public static void main(String[] args) {
//1.        try {
//            System.out.println("Hello"+ 1 / 0);
//        }catch (ArithmeticException e){
//            System.out.println("world");
//        }

//2.        if(true)
//            break;//Break outside switch or loop (Error)

        short a = 128;
        short b = (short) ~a;//variable "a" is a short, but ~a becomes an int
        System.out.println(a + "  "+ b);
        for(int i = 0; i <= 20;i++){
            System.out.println(i + "  "+ ~i);

        }



    }
}
//        0  -1
//        1  -2
//        2  -3
//        3  -4
//        4  -5
//        5  -6
//        6  -7
//        7  -8
//        8  -9
//        9  -10
//        10  -11
//        11  -12
//        12  -13
//        13  -14
//        14  -15
//        15  -16
//        16  -17
//        17  -18
//        18  -19
//        19  -20
//        20  -21
