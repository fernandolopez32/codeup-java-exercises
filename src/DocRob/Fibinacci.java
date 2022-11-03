package DocRob;

public class Fibinacci {
    public static long  fib(long n){
        if(n == 0){
            return 0;
        }
        if(n == 1) {
            return 1;
        }
            return fib(n-1) + fib(n-2);

    }
//    private static long[] memoTable = new long[999999999];
//    public static long  fib(long n){
//
//        if(n == 0){
//            return 0;
//        }
//        if(n == 1) {
//            return 1;
//        }
//        if(memoTable[n] ! = 0){
//
//        }
//            return fib(n-1) + fib(n-2);
//
//    }

    // escape is number is smaller than any other number
    public static int min(int[] n){
        return  0;
    }


    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(fib(10));
        System.out.println("""
                this is print line
                """);
    }
}
