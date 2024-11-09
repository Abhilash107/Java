package Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        System.out.println(smallestNumber(1, 2));
    }
    public static int smallestNumber(int n, int t) {
        int x = n;
        while(product(x)%t != 0){
            x++;
        }
        return x;
        
        
    }
    public static int product(int n){
        int product = 1;
        int temp = n;
        while(temp > 0){
            if(product == 0) break;
            product *= (temp%10);
            temp /= 10;
        }
        return product;
    }
    
}
