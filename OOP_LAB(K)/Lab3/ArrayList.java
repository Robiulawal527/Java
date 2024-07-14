import java.util.ArrayList;
class PrimeArrayList {
    public static boolean isPrime(int a){
        boolean flag = true;
        for(int i = 2; i<a; i++){
            if(a%i==0){
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static ArrayList<Integer> getPrimes(ArrayList<Integer> arr){
        ArrayList<Integer> primes = new ArrayList<>();
        for(int a: arr){
            if(isPrime(a) == true){
                primes.add(a);
            }
        }
        return primes;
    }
    public static void main(String[] args){
        // ArrayList<Integer> nums = new ArrayList<Integer>();
        // nums.add(10); // nums[i] = 10;
        // nums.add(15);
        // nums.add(20);
        // nums.add(2, 50);
        // nums.add(nums.size()-1, 100);
        // nums.remove(0);
        // nums.set(2, 90); // nums[2] = 90
        // for(int a: nums){
        //     System.out.println(a);
        // }
        // System.out.println();
        // for(int i = 0; i<nums.size(); i++){
        //     System.out.println(nums.get(i));
        // }
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 0; i<20; i++){
            int x = (int)(Math.random()*100);
            if(!nums.contains(x)){
                nums.add(x);
            }else{
                i--;
            }   
        }
        System.out.println("Original list: ");
        for(int a: nums){
            System.out.println(a);
        }
        ArrayList<Integer> r = getPrimes(nums);
        System.out.println("Primes: ");
        for(int a: r){
            System.out.println(a);
        }
    }
}