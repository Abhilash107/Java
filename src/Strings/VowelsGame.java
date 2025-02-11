package Strings;

public class VowelsGame {
    public static void main(String[] args) {

    }
    public static boolean doesAliceWin(String s) {
        // int vowelsCount = 0;
        // String vowels = "aeiou";
        // for(int i = 0; i <s.length();i++){
        //     if(vowels.contains(s.charAt(i)+"")) vowelsCount++;
        // }

        // return vowelsCount > 0 ? true : false;

        //  for (int i = 0; i < s.length(); i++) {
        //     switch (s.charAt(i)) {
        //         case 'a':return true;
        //         case 'e':return true;
        //         case 'i':return true;
        //         case 'o':return true;
        //         case 'u':return true;

        //     }
        // }

        // return false;

        String vowels = "aeiou";
        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) return true;
        }
        return false;

    }
}
