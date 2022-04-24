package leetCode.Strings;

import leetCode.array.RotateImage;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        String s="aab";
//        PalindromePartitioning palindromePartitioning=new PalindromePartitioning();
//        List<List<String>> listResult=palindromePartitioning.partition(s);
//        System.out.println(Arrays.toString(listResult.toArray()));

//        IPAddress ipAddress=new IPAddress();
//        String address=ipAddress.defangIPaddr("1.1.1.1");
//        System.out.println(address);

//        char[] string={'a','b','c'};
//        ReverseString reverseString=new ReverseString();
//        char[] result=reverseString.reverseString(string);
//        System.out.print(Arrays.toString(result));
//        int[][] matrix={
//                {5,1,9,11},
//                {2,4,8,10},
//                {13,3,6,7},
//                {15,14,12,16}
//        };
//        RotateImage rotateImage=new RotateImage();
//        rotateImage.rotate(matrix);
        String s="rat";
        String t="car";
        Anagram anagram=new Anagram();
        boolean result=anagram.isAnagram(s,t);
        System.out.println(result);
    }
}
