package leetCode.array;

public class lngPrefix {

    public String longestCommonPrefix(String[] strs) {
        String prefix="";
        for(int i=0;i<strs[0].length();++i){
            for(int j=1;j<strs.length;++j){
                if(i==strs[j].length()) return  prefix;

                if(strs[0].charAt(i)!=strs[j].charAt(i)) return  prefix;
            }
            prefix+=strs[0].charAt(i);

        }


        return  prefix;
    }

}
