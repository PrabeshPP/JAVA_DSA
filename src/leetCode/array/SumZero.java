package leetCode.array;

import java.sql.Array;
import java.util.ArrayList;

public class SumZero {
    public int[] sumZero(int n) {
        ArrayList<Integer> arr=new ArrayList<Integer>(n);

        for(int i=0;i<n/2;i++){
           arr.add(i+1);
           arr.add(-(i+1));
        }

        if(n%2!=0){
          arr.add(0);
        }
        int[] list=new int[n];
        for(int i=0;i<arr.size();i++){
            list[i]=arr.get(i);

        }

       return  list;
    }
}
