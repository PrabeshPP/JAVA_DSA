import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        String day;
        Scanner scanner=new Scanner(System.in);
        day=scanner.nextLine();
        // Switch case
        switch(day){
            case "Sunday":
                System.out.println("It's resting time");
                break;
            case "Monday":
                System.out.println("It's Monday");
                break;
            case "Tuesday":
                System.out.println("It's Tuesday");
                break;
            case "Thursday":
                System.out.println("It's thursday");
                break;
            default:
                System.out.println("Soory!couldn't find the day you entered");
                break;
        }

        scanner.close();

    }
    
}
