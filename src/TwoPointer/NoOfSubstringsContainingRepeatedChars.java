package TwoPointer;

public class NoOfSubstringsContainingRepeatedChars {
    public static void main(String[] args) {
        String s = "abcabc";
        System.out.println(numberOfSubstrings(s));
    }
    public static int numberOfSubstrings(String s) {
        int lastSeen[] = {-1, -1, -1};
        int cnt = 0;
        int n = s.length();
        for(int i = 0; i < s.length();i++){
            lastSeen[s.charAt(i) - 'a'] = i;//good one;
            cnt += Math.min(lastSeen[0], Math.min(lastSeen[1], lastSeen[2])) + 1;
        }
        return cnt;
    }
}

