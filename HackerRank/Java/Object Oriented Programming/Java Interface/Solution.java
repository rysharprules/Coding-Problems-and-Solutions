import java.util.*;
interface AdvancedArithmetic{
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n){
         int sum  = 0;
         int sqrt = (int) Math.sqrt(n);
         for (int i = 1; i <= sqrt; i++) {
             if (n % i == 0) { // if "i" is a divisor
                 sum += i + n/i; // add both divisors
             }
         }
         // if sqrt is a divisor, we should only count it once
         if (sqrt * sqrt == n) {
             sum -= sqrt;
         }
         return sum;
    }

    public int divisor_sum_withStreams(int n){
        return java.util.stream.IntStream.rangeClosed(1,n).filter(e -> n % e == 0).sum();
    }
}

class Solution{
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

