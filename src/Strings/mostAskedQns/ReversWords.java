package Strings.mostAskedQns;

public class ReversWords {

    public static void main(String[] args) {
        String s = "I love coding";
        System.out.println(revWords(s));

    }

    public static String revWords(String s){
        String str[] = s.trim().split("\\s+");
        int n = str.length;

        StringBuilder res = new StringBuilder();

        for(int i = n-1; i >= 0;i--){
            //if(i == 0)res.append(str[i]);
            //else res.append(str[i]).append(" ");
            res.append(str[i]).append(" ");

        }

        //return res.toString();
        return res.toString().trim();
    }
}
