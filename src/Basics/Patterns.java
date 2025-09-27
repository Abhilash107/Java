package Basics;

public class Patterns {
    public static void main(String[] args) {

//        int cnt = 10;
//        int num = 1;
//        while(cnt != 5){
//
//            System.out.println(++cnt);
//
//        }
//
//        while(cnt > 0){
//            System.out.println(cnt--);
//        }

        int a = 1, b = 1;
        boolean flag = false;



        for(int i = 1;i <= 10;i++){
            System.out.println(b);
            if(b < 5){
                b++;
            }
            else{
                b = (2 *b) - b;
            }
        }




    }
}
