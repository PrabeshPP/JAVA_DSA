package leetCode.array;

public class leap {

    boolean isLeapYear(int year){
        int result=year %4;
        return result == 0;
    }
}
