package leetCode.sorting;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr={1};
//        MissingNumber missingNumber=new MissingNumber();
//        int result=missingNumber.missingNumber(arr);
//        System.out.println(result);
//        NumbersDisappeared numbersDisappeared=new NumbersDisappeared();
//        List<Integer> list=numbersDisappeared.findDisappearedNumbers(arr);
//        System.out.println(Arrays.toString(list.toArray()));

//        DuplicateNumber duplicateNumber=new DuplicateNumber();
//        int result=duplicateNumber.findDuplicate(arr);
//        System.out.println(result);

//        AllDuplicatesArray allDuplicatesArray=new AllDuplicatesArray();
//        List<Integer> list=allDuplicatesArray.findDuplicates(arr);
//        System.out.println(Arrays.toString(list.toArray()));


//        SetMismatch setMismatch=new SetMismatch();
//        int[] resultArr=setMismatch.findErrorNums(arr);
//        System.out.println(Arrays.toString(resultArr));


            FindMissingPositiveInteger findMissingPositiveInteger=new FindMissingPositiveInteger();
            int result=findMissingPositiveInteger.firstMissingPositive(arr);
            System.out.println(result);



    }
}
