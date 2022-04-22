package leetCode.Strings;

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

        char[] string={'p','r','a','b','e','s'};
        ReverseString reverseString=new ReverseString();
        char[] result=reverseString.reverseString(string);
        System.out.print(Arrays.toString(result));
    }
}
