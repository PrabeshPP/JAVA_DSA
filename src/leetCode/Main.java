package leetCode;

import java.util.Scanner;
import java.util.Stack;

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

//        Scanner scanner=new Scanner(System.in);
//        System.out.print("Enter the year(ex.2019) :");
//        int year=scanner.nextInt();
//        leap leapp=new leap();
//        boolean result=leapp.isLeapYear(year);
//        if(result){
//            System.out.println(year+" is a leap year");
//        }else{
//            System.out.println(year+"is not a leap year");
//        }

//        String[] arr={"flower","flow","flight"};
//        lngPrefix lngprefix=new lngPrefix();
//       String pref= lngprefix.longestCommonPrefix(arr);
//        System.out.println(pref);

//        String s="[[[]";
//        parenthesis p=new parenthesis();
//        boolean x=p.isValid(s);
//
//        System.out.println(x);
//
//        Stack<Character> stack = new Stack<Character>();
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
//                stack.push(s.charAt(i));
//            }
//
//            }
//        for(int i=0;i<5;++i){
//            System.out.println(stack.pop());
//        }

        int [] nums={1,3};
        int target=3;

        RotateArray rotateArray=new RotateArray();
        int index=rotateArray.search(nums,target);
        System.out.println(index);








        }






}
