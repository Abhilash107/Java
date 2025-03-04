package leetcodedaily;

public class checkIfNumSumOfPowOfThree {
    public static void main(String[] args) {
        String str = decimalToTernary(91);
        boolean res = true;
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) == '2'){
                res = false;
            }
            if(res == false)break;
        }
        System.out.println(res);
    }

    public static String decimalToTernary(int n){
        StringBuffer s = new StringBuffer("");

        while(n > 0){
            s.append(n%3);
            n/=3;
        }
        return s.reverse().toString();

    }
}
