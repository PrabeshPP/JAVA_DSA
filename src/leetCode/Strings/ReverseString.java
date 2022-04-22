package leetCode.Strings;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {
    //

   public char[] reverseString(char[] string){
       int i=0;
       int j=string.length-1;
       while(i<=j){
           char temp=string[i];
           string[i]=string[j];
           string[j]=temp;
           i++;
           j--;
       }
       return string;
   }

}
