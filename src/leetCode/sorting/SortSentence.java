package leetCode.sorting;

import java.util.Arrays;

public class SortSentence {
    public static void main(String[] args) {
        String s="Myself2 Me1 I4 and3";
        String o=sortSentence(s);

    }

    public static  String sortSentence(String s) {
        StringBuilder str=new StringBuilder();
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
                char currentValue = arr[i].charAt(arr[i].length() - 1);
                int value = Integer.parseInt(Character.toString(currentValue));
                String temp=arr[i].substring(0,arr[i].length());
                arr[i]=arr[value-1];
                arr[value-1]=temp;
        }

        return "Hello";
    }
}