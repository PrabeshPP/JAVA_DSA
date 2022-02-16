package leetCode;

import java.util.ArrayList;
import java.util.List;

public class ArrayToInteger {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list=new ArrayList<Integer>();
        String stno="";
        for(int i=0;i<num.length;i++){
           stno+=String.valueOf(num[i]);
        }
        int number=Integer.parseInt(stno);

        Integer total=number+k;
        String strTotal=total.toString();

        for(int i=0;i<strTotal.length();i++){
            list.add(Integer.parseInt(String.valueOf(strTotal.charAt(i))));

        }






        return list;

    }
}
