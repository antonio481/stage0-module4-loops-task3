package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int fib1=1;
        int fib2=1;
        int sum=0;
        System.out.println(fib1);
        System.out.println(fib2);
        for (int i=0;i<lastFibonacci-2;i++){
            sum=fib1+fib2;
            fib1=fib2;
            fib2=sum;
            System.out.println(sum);
        }
    }
}
