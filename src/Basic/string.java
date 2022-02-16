package Basic;

public class string {
    public static void main(String[] args) {
        String country="   Nepal  ";
        //comparing the string
        boolean result=country.equals("Nepal");
        System.out.println(result);

        //Length of the string

        System.out.print(country.length());

        //CharAt
        System.out.println(country.charAt(1));

        //Checking whether the string is empty or not

        System.out.println(country.isEmpty());

        // 
        String result1=country.toUpperCase();
        System.out.println(result1);

        // trim()
        System.out.println(country.trim());

    }
    
}
