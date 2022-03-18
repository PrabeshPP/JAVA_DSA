package leetCode.sorting;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr={3,1,3,2};
//        MissingNumber missingNumber=new MissingNumber();
//        int result=missingNumber.missingNumber(arr);
//        System.out.println(result);
//        NumbersDisappeared numbersDisappeared=new NumbersDisappeared();
//        List<Integer> list=numbersDisappeared.findDisappearedNumbers(arr);
//        System.out.println(Arrays.toString(list.toArray()));

        DuplicateNumber duplicateNumber=new DuplicateNumber();
        int result=duplicateNumber.findDuplicate(arr);
        System.out.println(result);




    }
}
