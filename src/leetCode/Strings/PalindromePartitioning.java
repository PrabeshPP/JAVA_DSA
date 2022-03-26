package leetCode.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        StringBuilder builder=new StringBuilder();
        List<List<String>> list= new ArrayList<>();
        List<String> listStr=new ArrayList<String>();
        for(int i=0;i<s.length();i++){
            Character chr=s.charAt(i);
            listStr.add(chr.toString());

        }

        list.add(listStr);
        System.out.println(Arrays.toString(list.toArray()));

        return list;

    }
}
