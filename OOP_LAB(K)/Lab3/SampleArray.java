import java.util.Scanner;
class SampleArray {
    public static int maxIndex(int[] arr){
        int max = arr[0];
        int mIdx = 0;
        for(int i = 1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                mIdx = i;
            }
        }
        return mIdx;
    }
    public static int minElement(int[] arr){
        int min = arr[0];
        for(int a: arr){
            if(a < min){
                min = a;
            }
        }
        return min;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] nums = new int[20];
        // for(int i = 0; i<5; i++){
        //     nums[i] = input.nextInt();
        // }
        for(int i = 0; i<20; i++){
            nums[i] = (int)(Math.random()*100);
        }
        // for(int i = 0; i<nums.length; i++){
        //     System.out.println(nums[i]);
        // }
        for(int a : nums){
            System.out.println(a);
        }
        System.out.println(maxIndex(nums));
        System.out.println(minElement(nums));
    }
}