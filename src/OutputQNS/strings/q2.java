package OutputQNS.strings;

import java.util.Arrays;

public class q2 {
    public static void main(String[] args) {
        //1.
        String str = "nobody does like this";
        String key = "nobody";
        int f = str.lastIndexOf(key);//Result of 'str. lastIndexOf(key)' is always '0'
        System.out.println(f);
//2.
        StringBuilder s = new StringBuilder("steve jobs is legend");
        System.out.println(s.length());
        s.delete(5, s.length() - 7);
        System.out.println(s.toString());

        //3.
        char p[] = new char[20];
        String s1 = "string";
        int len = s1.length();
        for (int i = 0;i < len;i++){
            p[i] = s.charAt(len - i - 1);
        }

        System.out.println(Arrays.toString(p));
        //[ , e, v, e, t, s,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ]

        //4.
        System.out.println("HelloQuiz".substring(4));
        System.out.println("HelloQuiz".substring(6));

    }
}
