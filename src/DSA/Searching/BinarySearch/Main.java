package DSA.Searching.BinarySearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        BinarySearch binarySearch=new BinarySearch();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number you want to search using the binary algorithm:");
        int target=scanner.nextInt();
        int index=binarySearch.find(arr,target);
        if(index!=-1){
            System.out.println("The target number is at "+index);
        }else{
            System.out.println("Oops!The target element could not be found");
        }


    }
}
