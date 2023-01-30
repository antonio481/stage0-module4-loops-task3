package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int tenPow=1;
        int sum=0;
        for (int i=1;i<=lengthOfLastNumber;i++){
            tenPow*=10;
            sum=sum+(tenPow-1);
        }
        System.out.println(sum);
    }
}
