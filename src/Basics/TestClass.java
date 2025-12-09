package Basics;

public class TestClass {
    public static void main(String[] args) {
//        Student std = new Student();//Obj of a Student class with ref variable name std;
//        std.marks = 10;
//
//        std.name = "Abhilash";
//        // Since String is a class so it can also be defined as:
//        String newString = new String("Abhilash");
//
//        System.out.println(std.name.equals(newString));
        String str = "level";

        int freq[] = new int[256];
        int cnt = 0, dupCnt = 0;

        for(int i = 0;i < str.length();i++){
            char ch = str.charAt(i);

            freq[ch - 'a']++;
            if(freq[ch - 'a'] > 0)cnt++;
            if(freq[ch - 'a'] > 1)dupCnt++;

        }
        System.out.println(cnt+ " "+ dupCnt);
        System.out.println((int)factorial(cnt)/factorial(dupCnt));


    }
    public static int totalCombinationPosssible(String str){
        int freq[] = new int[256];
        int n = str.length();

        for(int i = 0;i < n;i++){
            char ch = str.charAt(i);

            freq[ch - 'a']++;
        }

        int result = factorial(n);


        for (int i = 0; i < 256; i++) {
            if (freq[i] > 1) {
                result /= factorial(freq[i]);
            }
        }

        return result;
    }
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1;i <= n;i++)fact *= i;

        return fact;

    }
}
