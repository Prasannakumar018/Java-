public class FindMissingNumber {
    public static void main(String[] args) {
       
        int[] numbers01 = {1,2,3,4,5,6,7,8,9, 11,12};
         
        int N = 12;
        int idealSum = (N * (N + 1)) / 2;
        int sum = calculateSum(numbers01);
 
        int missingNumber = idealSum - sum;
        System.out.println(missingNumber);
    }
 
    private static int calculateSum(int[] numbers01) {
        int sum = 0;
        for (int n : numbers01) {
            sum += n;
        }
        return sum;
    }
}
