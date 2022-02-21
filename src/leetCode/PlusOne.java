package leetCode;

import java.util.ArrayList;
import java.util.List;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        List<Integer> list=new ArrayList<Integer>();
        int k=1;
        int i=digits.length-1;
       while(i>=0 || k>0){
           if(i>=0){
               k=k+digits[i];
           }
           list.add(k%10);
           k/=10;
           i--;

       }
        int[] arr=new int[list.size()];
        for(int j=0;j<list.size();j++){
            arr[j]=list.get(list.size()-1-j);
        }
        return arr;
    }

}
