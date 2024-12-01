package logicBuildings;

public class ContestQ1 {
    public static void main(String[] args) {
        System.out.println(ans(3));





    }
    public static int ans(int n){
        String s = Integer.toBinaryString(n);
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            str += 1;
        }
        int res = 0;int pow = 0;
        for (int i = 0; i < str.length(); i++) {
            res += (int)Math.pow(2,pow++);
        }

        return res;
    }
}
