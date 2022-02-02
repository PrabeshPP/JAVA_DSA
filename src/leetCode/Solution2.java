package leetCode;

public class Solution2 {
    enum Day {
        Sunday,
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday

    }
    void multiplication(int n){
        for(int i=1;i<=10;++i){
            System.out.println(i+" * "+n+" = "+i*n);
        }
    }

    void add(int n1,int n2){
        System.out.println("The sum of two numbers is "+(n1+n2));
    }

    void findDay(int n){
        String day=Day.values()[n].toString();
        System.out.println("The day of the week is "+day);
    }

    void incomeTax(long salary){
        long remSalary=(long)(salary-0.13*salary);
        System.out.println("The amount of salary you will receive after the tax deduction is "+remSalary);
    }


}
