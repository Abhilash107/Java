package TwoPointer;

public class LongestSunStringWORepeating {
    public static void main(String[] args) {
        String s = "cacavc";
        System.out.println(lengthOfLongestSubstring(s));
        
    }

    public static int lengthOfLongestSubstring(String s) {
        int finalLength = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int length = 0;
            StringBuilder res = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                if(res.toString().contains(String.valueOf(s.charAt(j)))){
                    break;
                }
                else{
                    res.append(s.charAt(j));
                    length++;
                }  
            }
            finalLength = Math.max(finalLength, length);
        }
        return finalLength;
    }
}
