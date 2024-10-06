package Strings;

class longestPrefixx{
    public static void main(String[] args) {
        String s[] = {"flower", "flow", "rabbit"};
        //String result = findLongestPrefix(s);
        System.out.println(findLongestPrefix(s));
    }

    public static String findLongestPrefix(String str[]){
        String ans = "";
        int j =0;
        for (int i = 0; i < str.length; i++) {
            String eachStr = str[i];
            if(ans == "") {ans += eachStr.charAt(j);}

            else if(ans.contains(String.valueOf(ans.charAt(j - 1)))){
                ans += eachStr.charAt(j);
            }
            else{
                return ans;
            }
        }

        return "";
    }
}