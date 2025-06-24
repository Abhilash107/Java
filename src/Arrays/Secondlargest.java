package Arrays;

public class Secondlargest {
    public static void main(String[] args) {
        int a[] = {2,4,3,4,7,4, 7};

        int largest = largest(a);
        int secondLargest = secondLargest(a);

        System.out.println(largest + " " + secondLargest);
    }


    public static int largest(int a[]){

        int n = a.length;
        int largest = Integer.MIN_VALUE;

        for(int i = 0;i < n;i++){

            if(a[i] > largest) largest = a[i];

        }

        return largest;

    }

    public static int secondLargest(int a[]){

        int n = a.length;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0;i < n;i++){

            if(a[i] > largest){
                secondLargest = largest;
                largest = a[i];
            }
            else if (a[i] > secondLargest && a[i] != largest) {
                secondLargest = a[i];

            }

        }

        return secondLargest;

    }
}
