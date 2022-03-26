package leetCode.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> list= new ArrayList<>();
        List<String> listStr=new ArrayList<>();
       helper(0,s,listStr,list);
       return list;

    }
    //We need to use the recursive function.
    public void helper(int index,String s,List<String> listStr,List<List<String>> list){
        if(index==s.length()){
            list.add(new ArrayList<>(listStr));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalinDrome(index,i,s)){
                listStr.add(s.substring(index,i+1));
                helper(i+1,s,listStr,list);
                listStr.remove(listStr.size()-1);

            }
        }

    }

    public boolean isPalinDrome(int start,int end,String s){
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }else{
                start++;
                end--;
            }
        }

        return true;
    }
}
