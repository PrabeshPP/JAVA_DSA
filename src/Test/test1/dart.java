package Test.test1;

public class dart {
    public static void main(String[] args) {
        String s = "MCMXCIV";

      int value = 0;
        int n=0;
        while(n<s.length()){

            switch (s.charAt(n)){
                case 'I':
                    if(s.charAt(n)=='I' && n!=s.length()-1){
                        if(s.substring(n,n+2).equals("IV")){
                            value+=4;
                            n+=2;
                        }else if(s.substring(n,n+2).equals("IX")){
                            value+=9;
                            n+=2;
                        }

                        else{
                            value+=1;
                            n+=1;

                        }
                    }else{
                        value+=1;
                        n+=1;
                    }

                    break;
                case 'V':
                    value+=5;
                    break;
                case 'X':
                    if(s.charAt(n)=='X' && n!=s.length()-1){
                        if(s.substring(n,n+2).equals("XL")){
                            value+=40;
                            n+=2;
                        }else if(s.substring(n,n+2).equals("XC")){
                            value+=90;
                            n+=2;
                        }

                        else{
                            value+=10;
                            n+=1;

                        }
                    }else{
                        value+=10;
                        n+=1;
                    }

                    break;

                case 'C':
                    if(s.charAt(n)=='C' && n!=s.length()-1){
                        if(s.substring(n,n+2).equals("CD")){
                            value+=400;
                            n+=2;
                        }else if(s.substring(n,n+2).equals("CM")){
                            value+=900;
                            n+=2;
                        }

                        else{
                            value+=100;
                            n+=1;

                        }
                    }else{
                        value+=100;
                        n+=1;
                    }

                    break;

                case 'D':
                    value+=500;
                    n+=1;
                    break;
                case 'M':
                    value+=1000;
                    n+=1;
                    break;






            }

        }

        System.out.println(value);


    }
}

