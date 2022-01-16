public class prinf {
    public static void main(String[] args) {
       
        boolean myBoolean=true;
        char myChar='s';
        String myString="Prabesh";
        int myInt=12000000;
        double myDouble=1000.12234;

        double pie=Math.PI;

        // conversion character
        System.out.printf("%b \n", myBoolean);
        System.out.printf("%c \n", myChar);
        System.out.printf("%s \n",myString);
        System.out.printf("%d \n", myInt);
        System.out.printf("%f",myDouble);

        //minimum number of characters to be written as output
        System.out.printf("Hello %1s \n", myString);
        // Precison
        System.out.printf("%.2f \n", pie);

        //flags
        System.out.printf("%,d", myInt);

        
    }
    
}
