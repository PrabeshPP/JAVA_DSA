package leetCode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Solution solution=new Solution();
//        boolean x=solution.isPalindrome(123);
//        System.out.println(x);
//
//        Solution2 solution2=new Solution2();
//        solution2.muliolication(8);

//        solution2.add(10,20);

//        solution2.findDay(3);

//        solution2.incomeTax(2000000000);

//        solution2.addEven(10);

//        solution2.printPattern();

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the year(ex.2019) :");
        int year=scanner.nextInt();
        leap leapp=new leap();
        boolean result=leapp.isLeapYear(year);
        if(result){
            System.out.println(year+" is a leap year");
        }else{
            System.out.println(year+"is not a leap year");
        }



    }
}
