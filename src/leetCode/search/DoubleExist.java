package leetCode.search;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DoubleExist {
    public boolean checkIfExist(int[] arr) {
        boolean exist=false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr.length;j++){
                if(j==i){
                    continue;
                }else{
                    if(arr[i]==2*arr[j]){
                        exist=true;
                    }
                }
            }
        }

        return exist;
    }


}
