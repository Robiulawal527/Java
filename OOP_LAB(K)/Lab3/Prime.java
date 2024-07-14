class Prime {
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
    public static int[] getPrimes(int[] arr){
        int size = 0;
        for(int a: arr){
            if(isPrime(a) == true){
                size++;
            }
        }
        int[] primes = new int[size];
        int i = 0;
        for(int a: arr){
            if(isPrime(a) == true){
                primes[i] = a;
                i++;
            }
        }
        return primes;
    }
    public static void main(String[] args){
        int[] nums = new int[20];
        for(int i = 0; i<20; i++){
            nums[i] = (int)(Math.random()*100);
        }
        int[] r = getPrimes(nums);
        for(int a: r){
            System.out.println(a);
        }
    }
}