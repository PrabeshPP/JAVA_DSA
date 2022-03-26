package Strings;

public class Main {
    public static void main(String[] args) {
        //String Builder
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            builder.append(ch);

        }

        System.out.println(builder);

    }
}
