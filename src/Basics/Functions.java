package Basics;

public class Functions {
    public static void main(String[] args) {
        //1. Methos Exm
        int[] arr = {1,2,3,4,5};
        int res = sumOfArr(arr);
        //System.out.println("Sum: "+ res);

        //3. Now the call by value and ref in JAVA
        String a = "Abhilash";
        System.out.println(getUpperCase(a));//ABHILASH  -> new String
        System.out.println(a);//Abhilash
        //If an Object is used here then it would have changed the String


        //4. example
        System.out.println(sum(1,2,3,4,5,6,7,8));
        System.out.println(sum(1,2,3,4,5,6));
        System.out.println(sum(1,2,3,4));





    }


    //1. Difference between Function and Method:

    // A function is a generic term for a reusable block of code.
    // A method is a function that belongs to a class (as in Java, everything is inside a class).
    // In languages like C and Python, standalone functions exist, but in Java, functions are always inside classes and are called methods.

    public static int sumOfArr(int[] a){
        int sum = 0;
        int n = a.length;
        for(int i = 0 ;i < n;i++){
            sum += a[i];
        }

        return sum;
    }



    //2. Method overloading


    public static int sum(int a, int b){
        return a + b;
    }
    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    //    Best Practices for Method Overloading in Java
        //    Differentiate by Parameters – Vary number or type, not return type.
        //    Avoid Overloading by Return Type – Java doesn’t allow it.
        //    Use Clear Names – Prefer distinct names if overloading causes confusion.
        //    Ensure Consistent Behavior – Methods should perform similar tasks.
        //    Improve Readability – Overload only when it simplifies usage.
        //    Limit Overloads – Too many? Use default values or method chaining.
        //    Keep Signatures Intuitive – Follow predictable patterns.
        //    Follow Naming Conventions – Ensure clarity and maintainability.

    //Error
//    public static int difference(int a, int b){//Signature is same
//        return a - b;
//    }
//    public static String difference(int a, int b){
//        return "a - b";
//    }
    //You are trying to overload the difference method by defining two methods with the same name
    // in Java, method overloading is based on method signatures, which consist of:
    //
    //1. Method name(either chnage the name)
    //2. Parameter list (type and number of parameters)/ (or overload this)


    //3. Reference type
    public static String getUpperCase(String str){
        return str.trim().toUpperCase();
    }
//    Java: Call by Value vs. Call by Reference (Notes)
//    Java is always "Call by Value" – Whether passing primitives or objects, Java passes a copy of the value.
//            Primitives (int, double, etc.) – The actual value is copied; changes inside the method do not affect the original variable.
//            Objects (Reference Types) – A copy of the reference (memory address) is passed, not the actual object.
//    Immutable Objects (e.g., String) – Cannot be modified; reassignment inside a method only affects the local copy of the reference.
//    Mutable Objects (e.g., StringBuilder, Arrays, Custom Classes) – Can be modified inside the method, as changes affect the same referenced object.
//    Reassigning an Object Inside a Method – Only changes the local reference; the original reference in the caller remains unchanged.


    //4. Another way of passing many params
    public  static int sum(int ...nums){
        int sum = 0;
        for (int x: nums){
            sum += x;
        }

        return sum;
    }

    public static class FactorialTrailingZeros {
        public static void main(String[] args) {
            System.out.println(trailingZeroes(0));
        }
        public static int trailingZeroes(int n) {
            if( n == 0) return 0;
            int fact = 1;
            for(int i = 2;i <= n;i++){
                fact *= i;
            }

            int count = 0;
            int temp = fact;
            while(temp%10 == 0){
                count++;
                temp /= 10;
            }

            return count;
        }
    }

    public static class perfectSquare {
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
}
