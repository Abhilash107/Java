package Questions.tcs;

import java.util.*;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        int val = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch))sb.append((ch - 'a' + val)%26 + 'a');

            else if(Character.isUpperCase(ch))sb.append((ch - 'A' + val)%26 + 'A');

            else if(Character.isDigit(ch))sb.append((ch - '0' + val)%10 + '0');
            else sb.append(ch == '@' ? '#' : '@');
        }

        System.out.println(sb.toString());
    }
}
