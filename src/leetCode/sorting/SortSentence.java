package leetCode.sorting;

import java.util.Arrays;

public class SortSentence {
    public static void main(String[] args) {
        String s="KTFkUVVrmYMSo2 wXlQraUqblfhCfDLK3 IfTuftYVualQ6 NhpQ5 HlRjClVtQrTFcwbx4 fi1";
        String o=sortSentence(s);

    }

    public static  String sortSentence(String s) {
        StringBuilder str=new StringBuilder();
        String[] arr = s.split(" ");
        int j=0;
        while(j<arr.length-1){
                char currentValue = arr[j].charAt(arr[j].length() - 1);
                int value = Integer.parseInt(Character.toString(currentValue));
                char rValue=arr[value-1].charAt(arr[value-1].length()-1);
                int rInt=Integer.parseInt(Character.toString(rValue));
                if(value!=rInt){
                    String temp=arr[j].substring(0,arr[j].length());
                    arr[j]=arr[value-1];
                    arr[value-1]=temp;

                }else{
                    j++;
                }
//
        }


        int i=0;
        for(String elem:arr){
            if(i== arr.length-1){
                str.append(elem.substring(0, elem.length() - 1));
            }else{
                str.append(elem.substring(0, elem.length() - 1));
                str.append(" ");
            }


            i++;
        }


        return str.toString();
    }
}