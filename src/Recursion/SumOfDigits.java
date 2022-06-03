package Recursion;

public class SumOfDigits {
    public int sum(int number){
        int total=0;
        if(number/10==0){
            return total;
        }

        total=number%10+sum(number/10);
        return total;

    }

}
