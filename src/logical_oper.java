public class logical_oper {
    public static void main(String[] args) {
        // logical operators = used to connect two or more expressions
        // && And Operator
        // || OR Operator
        // != not equal to operator
        

        int x=2;
        int y=20;


        if(x==2 && x>y){
            System.out.println("Two expressions are tue!");
        }else if(x==2 || x>y){
            System.out.println("One of the expression is true !");
        }else if(x!=y){
            System.out.println("The not equla express is true");
        }


    }
    
}
