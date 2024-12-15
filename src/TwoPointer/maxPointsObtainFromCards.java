package TwoPointer;

public class maxPointsObtainFromCards {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,1};
        int k = 3;
        System.out.println(maxScore(arr, k));
    }
    public static int maxScore(int[] cardPoints, int k) {
        if(k == 1) return Math.max(cardPoints[0], cardPoints[cardPoints.length - 1]);
        int leftSum = 0, rightSum = 0, maxSum = 0;

        for(int i = 0;i < k;i++){
            leftSum += cardPoints[i];
            maxSum = Math.max(maxSum, leftSum);
        }

        int rightIndex = cardPoints.length - 1;
        for(int i = k - 1;i >= 0;i--){
            leftSum -= cardPoints[i];
            rightSum += cardPoints[rightIndex];
            rightIndex--;
            maxSum = Math.max(maxSum, (leftSum + rightSum));

        }
        return maxSum;
    }
}
