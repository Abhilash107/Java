package TwoPointer;

import java.util.HashMap;

public class LongestcharacterReplacement {
    public static void main(String[] args) {
        String s = "ABBAAAB";
        int k = 2;
        System.out.println(characterReplacement(s, k));

    }

    public static int characterReplacement(String s, int k) {
        int l = 0, r = 0, maxFre = 0, maxlength = 0;
        HashMap<Character, Integer> map= new HashMap<>();

        while(r < s.length()){
            //Add to map
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            maxFre = Math.max(maxFre, map.get(s.charAt(r)));// increase the frequency

            if( (r-l +1) - maxFre > k ){// check bounds
                //Just slide the window by 1 place
                //1. decrease the frequency
                //2. increase the start pointer
                map.put(s.charAt(l), map.getOrDefault(s.charAt(l), 0) - 1);
                l++;
            }
            //Update the maxLength
            maxlength = Math.max(maxlength, r - l + 1);
            r++;//update the end pointer

        }
        return maxlength;
    }
}


