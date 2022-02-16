package leetCode;

public class EvenNumberDigits {
    public int findNumbers(int[] nums) {
        int counter=0;

        for(int i:nums){
            String strNumber=String.valueOf(i);
            int length=strNumber.length();
            if(length%2==0){
                counter++;
            }
        }


        return  counter;

    }
}
