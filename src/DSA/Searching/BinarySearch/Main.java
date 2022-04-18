package DSA.Searching.BinarySearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,6,7};
//        int[] arr1={7,6,5,4,3,2,1};
////        BinarySearch binarySearch=new BinarySearch();
//        Scanner scanner=new Scanner(System.in);
//        System.out.print("Enter the number you want to search using the binary algorithm:");
//        int target=scanner.nextInt();
////        int index=binarySearch.find(arr,target);
////
//        OrderAgnoisticBinarySearch orderAgnoisticBinarySearch=new OrderAgnoisticBinarySearch();
//        int index1=orderAgnoisticBinarySearch.findIndex(arr,target);
//        if(index1!=-1){
//            System.out.println("The target number is at "+index1);
//        }else{
//            System.out.println("Oops!The target element could not be found");
//        }

//        PerfectSquare perfectSquare=new PerfectSquare();
//        boolean result=perfectSquare.findPerfectSquare(1);
//        System.out.println(result);

//        int[] arr11={2,3,5,9,14,16,18};
//        Ceil ceil=new Ceil();
//        int index=ceil.findCeil(arr11,4);
//        System.out.println(index);

//        Floor floor=new Floor();
//        int num= floor.findFloor(arr11,10);
//        System.out.println(num);

        // Smallest char that is greater than the given target

//        char[] letters={'a','b'};
//        char target='z';
//        SmallestChar smallestChar=new SmallestChar();
//        char result=smallestChar.findSmallestChar(letters,target);
//        System.out.println(result);
//        int[] nums={5,7,7,8,8,10};
//        int target=8;
//        SearchRange searchRange=new SearchRange();
//        int[] result=searchRange.searchRange(nums,target);
//        System.out.println(result[0]+ " "+result[1]);





        // finding the number in an infinite length of an array

        int[] arr11={1,5,2,3};
//        int target=16;
//        InfiniteNumbers infiniteNumbers=new InfiniteNumbers();
//        int index=infiniteNumbers.findAns(arr11,target);
//        if(index>=0){
//            System.out.println("Your entered number is at "+index);
//        }else{
//            System.out.println("The searched number is not in the array.");
//        }

        //
//        MountainArray mountainArray=new MountainArray();
//        int index=mountainArray.findIndex(arr11);
//        System.out.println(index);

//        Mountain mountain=new Mountain();
//       int index= mountain.findMinIndex(arr11,0);
//       System.out.println(index);
        int[] nums={3, 5, 6, 7, 8, 9, 11, 12, 45, 67, 89};
        InfiniteNumbers infiniteNumbers=new InfiniteNumbers();
        int result=infiniteNumbers.findAns(nums,9);
        System.out.println(result);

    }
}
