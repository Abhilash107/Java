package Math;

public class perfectSquare {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        for(;sum <= 10000; i++){
            int j = i * i;
            sum+= j;
        }
        if(sum == 12) System.out.println(sum);
        System.out.println("hehe");
        
    }
}
