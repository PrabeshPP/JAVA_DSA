package leetCode;

public class Solution {
    public boolean isPalindrome(int x){
        String str=String.valueOf(x);
        int length=str.length();
        char a=str.charAt(0);
        char b=str.charAt(length-1);
        if(a==b){
            return  true;
        }else{
            return  false;
        }

    }
}
