import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        String day;
        Scanner scanner=new Scanner(System.in);
        day=scanner.nextLine();
        // Switch case
        switch(day){
            case("Sunday"):
                System.out.println("It's resting time");
            case("Monday"):
                System.out.println("It's Monday");
            case("Tuesday"):
                System.out.println("It's Tuesday");
            case("Thursday"):
                System.out.println("It's thursday");
            default:
                System.out.println("Soory!couldn't find the day you entered");;
        }

        scanner.close();

    }
    
}
