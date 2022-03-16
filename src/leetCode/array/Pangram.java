package leetCode.array;public class Pangram {
    public boolean checkIfPangram(String sentence) {
        boolean result=false;
        if(sentence.length()<26){
            return false;
        }
        for(char x='a';x<='z';x++){
            if(sentence.contains(String.valueOf(x))){
                System.out.print(!(sentence.contains(String.valueOf(x))));
                result=true;

            }else{

                return false;
            }
        }


        return result;
        //
    }
}
