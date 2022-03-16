package leetCode.array;

import java.util.Stack;

public class parenthesis {
    boolean isValid(String s) {
        boolean value=false;
        if(s.length()%2!=0){
            return  false;
        };
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            }else{
                if(stack.isEmpty()){
                    value=false;
                }else{
                    char c=stack.pop();;

                    if(s.charAt(i)==')'&&c=='('){
                        value=true;
                    }else if(s.charAt(i)==']'&&c=='['){
                        value=true;
                    }else if(s.charAt(i)=='}' && c=='{'){
                        value=true;
                    }else{
                        value=false;
                        break;
                    }

                }



            }
//            break;



        }
        if(!stack.isEmpty()){
            value=false;
        }
        return  value;
    }
}
