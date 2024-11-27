package Strings;

class gcd{
    public static void main(String[] args) {
        String s1 = "ABABAB";
        String s2 = "AB";
        System.out.println(gcdOfStrings(s1, s2));
    }

    public static String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1)) return "";// nice intuition

        int gcdLength = gcd(str1.length(), str2.length());// count gcd;

        return str1.substring(0, gcdLength);// return shortest one
    }

    public static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}