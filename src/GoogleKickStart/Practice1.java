package GoogleKickStart;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


public class Practice1 {
    public static void main(String[] args) {
        //
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int T=scanner.nextInt();
        for(int i=0;i<T;i++){
            System.out.println("Enter the Name of kingdom");
            String kingDom=scanner.next();
            String ruler=getRuler(kingDom);
            System.out.println("Case "+i+" :"+kingDom+" is ruled by "+ruler);
        }



    }

   static String getRuler(String kingdom){
       HashSet<Character> hashSet=new HashSet<Character>(Arrays.asList('a','e','i','o','u'));
        char lastchar=kingdom.charAt(kingdom.length()-1);
        lastchar=Character.toLowerCase(lastchar);
        if(hashSet.contains(lastchar)){
            return "Alice";
        }else if(lastchar=='y'){
            return "Nobody";
        }else{
            return "Bob";
        }
    }
}
;