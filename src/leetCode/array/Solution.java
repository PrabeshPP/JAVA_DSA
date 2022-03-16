package leetCode.array;

public class Solution {
    public boolean isPalindrome(int x){
      // 529 // 925
        int number=x;
        String number1=String.valueOf(number);
        String number2= "";
        for(int i=0;i<number1.length();++i){
            int rem=number % 10;
            number=number/10;
            String st=String.valueOf(rem);
            number2=number2+st;
        }
        int num1=Integer.parseInt(number1);
        int num2=Integer.parseInt(number2);
        if(num1==num2){
            return  true;

        }else{
            return  false;
        }






    }
}
