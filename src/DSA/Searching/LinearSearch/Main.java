package DSA.Searching.LinearSearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Bubble Sorting in Java
//        BubbleSort bubbleSort=new BubbleSort();
        int[] list={22,1,55,3,7,10,99,34,20};
//        int[] list1= bubbleSort.bubblesort(list);
//        System.out.println(list1[list1.length-1]);

//        int[] list={3,3};
//        AddList addList=new AddList();
//        int[] list1= addList.add(list,6);
//
//        for(int i=0;i<2;i++){
//            System.out.println(list1[i]);
//        }

        Scanner scanner=new Scanner(System.in);
//        LinearSearching linearSearching=new LinearSearching();
//        System.out.println("Enter the Number you want to search in the array:");
//        int target=scanner.nextInt();
//        int index=linearSearching.Linearsearch(list,target);
//        if(index==-1){
//            System.out.println("There is no number present in the list.");
//
//        }else{
//            System.out.println("Your number exist at "+index);
//        }
//
//        String str="My name is Prabesh Bista";
//        String targetString=scanner.next();
//       SearchinString searchinString=new SearchinString();
//       boolean value=searchinString.searchinstring(str,targetString);
//       if(value){
//           System.out.println("Yes,the target string exist in the given string value");
//
//       }else{
//           System.out.println("It doesnot contain any target string");
//       }


        // LinearSearch in Range

        int[] arr={18,12,-7,3,14,28} ;
//        linear_searching_range linearSearchingRange=new linear_searching_range();
//        System.out.println("Enter the number you want to search in the given array using linear search algorithm:");
//        int target=scanner.nextInt();
//        int index= linearSearchingRange.linearSearchingRange(arr,target);
//        if(index==-1){
//            System.out.println("Number not found");
//        }else{
//            System.out.println("Numbers found at the position "+index);
//        }



        // finding the minimum number in the array

        MiniNum miniNum=new MiniNum();
        int min=miniNum.FindMin(arr);
        System.out.println("The minimum number in the array is "+min);

    }
}
