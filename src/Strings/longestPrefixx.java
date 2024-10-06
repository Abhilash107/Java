package Strings;

class longestPrefixx{
    public static void main(String[] args) {
        String s[] = {"flower", "flow", "flat"};
        //String result = findLongestPrefix(s);
        System.out.println(findLongestPrefix2(s));
    }

    public static String findLongestPrefix(String str[]){
        StringBuilder ans = new StringBuilder();
        int j =0;int i =0;
        while(i < str.length && j < str[i].length()){
            if(i == 0){
                ans.append(str[i].charAt(j));
                i++;
            }

            else if(i == str.length){
                i=0;
                j++;
            }

            else if(j< str[i].length()  && ans.charAt(ans.length()-1) == str[i].charAt(j) ){
                i++;
                continue;   
            }

            else break;
        }

        return ans.toString();
    }

    
    public static String findLongestPrefix2(String str[]) {
        if (str == null || str.length == 0) return "";
    
        StringBuilder ans = new StringBuilder();
        int i = 1; // Start with the second string
        int j = 0; // Character index across all strings
    
        while (j < str[0].length()) {  // Traverse through the characters of the first string
            char currentChar = str[0].charAt(j);  // Get character from the first string at position j
    
            // Loop through each string, comparing the character at position j
            while (i < str.length) {
                if (j >= str[i].length() || str[i].charAt(j) != currentChar) {
                    return ans.toString();  // If any string doesn't match, return the result
                }
                i++;  // Move to the next string
            }
    
            // If all strings match for the current character, add it to the result
            ans.append(currentChar);
    
            j++;  // Move to the next character
            i = 1;  // Reset i to 1 to start checking the next character from the second string
        }
    
        return ans.toString();
    }
    
}