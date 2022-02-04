package Test.test1;

public class dart {
    public static void main(String[] args) {
        String s = "IIVI";

      int value = 0;
        int n=0;
        while(n<s.length()){
            if(s.charAt(n)=='I' && n!=s.length()-1){

                if(s.substring(n,n+2)=="IX"){
                    value+=4;
                    n+=2;
                }else{
                    value+=1;
                    n+=1;
                }
            }else{
                value+=1;
                ++n;
            }
        }

        System.out.println(value);


    }
}

