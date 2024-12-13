package PPT;

public class functionCheck {
    public static void main(String[] args) {
        int res = add(1,2);
        res = add(2,3,4);

        float res2 = add(1.2f, 2.3f);

        float res3 = add(1, 2.3f);
    }

    public static int add(int a, int b, int c){
        return a + b + c;
    }
    public static int add(int a, int b){
        return a + b;
    }

    public static float add(float a, float b){
        return a + b;
    }
    public static float add(int a, float b){
        return a + b;
    }


}
