package leetCode.Strings;

public class Anagram {
    public boolean isAnagram(String s, String t) {
        boolean result=false;
        int length1=s.length();
        int length2=t.length();
        if(length1<length2){
            for(int i=0;i<length1;i++){
               Character value=s.charAt(i);
               if(t.contains(value.toString())){
                   result=true;
                }else{
                   result=false;
               }
            }
        }
        return result;

    }
}
