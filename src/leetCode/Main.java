package leetCode;

import java.util.*;

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


        //Solved
//        int [] nums={4,5,6,7,0,1,2};
//        int target=6;
//
//        RotateArray rotateArray=new RotateArray();
//        int index=rotateArray.search(nums,target);
//        System.out.println(index);

//        POS pos=new POS();
////        int value= pos.subtractProductAndSum(4421);
////        System.out.println(value);

//        RotatedArrayIndex rotatedArrayIndex=new RotatedArrayIndex();
//
//        int index= rotatedArrayIndex.findRotateArrayIndex(nums);
//        if(index==-1){
//            System.out.println(0);
//        }else{
//            System.out.println(index);
//        }

//            int[] arr={8,1,2,2,3};
//        SplitArray splitArray=new SplitArray();
//
//        int sumExpected= splitArray.findMaxSumofSplitArray(arr,2);
//        System.out.println(sumExpected);
//        Shuffle shuffle=new Shuffle();
//        int[] arr1=shuffle.shuffle(arr,4);
//        for(int i=0;i<arr1.length;++i){
//            System.out.print(arr1[i]);
//        }

//        MaxCandies maxCandies=new MaxCandies();
//        List<Boolean> li=maxCandies.kidsWithCandies(arr,3);
//
//        System.out.println(li.get(3));


//        GooddPairs gooddPairs=new GooddPairs();
//        int pairs=gooddPairs.numIdenticalPairs(arr);
//        System.out.println(pairs);


//        SmallArray smallArray=new SmallArray();
//        int[] res=smallArray.smallerNumbersThanCurrent(arr);
//        System.out.println(res[0]+" "+res[2]);

//        int[] nums={0,1,2,3,4};
//        int[] index={0,1,2,2,1};
//
//        TargetArray targetArray=new TargetArray();
//        int[] arr202= targetArray.createTargetArray(nums,index);
//        for(int i=0;i<nums.length;++i){
//            System.out.print(arr202[i]+" ,");
//        }

//        System.out.println(nums[index[3]]);


//        String str="hxsdz";
//        Pangram pangram=new Pangram();
//        boolean result=pangram.checkIfPangram(str);
//        System.out.println(result);


//        List<List<String>> lists= new ArrayList<List<String>>();
//
//        lists.add(List.of(new String[]{"phone", "blue", "pixel"}));
//        lists.add(List.of(new String[]{"computer", "silver", "lenovo"}));
//        lists.add(List.of(new String[]{"phone","gold","iphone"}));
//
//        MatchingItem matchingItem=new MatchingItem();
//        int result=matchingItem.countMatches(lists,"name","pixel");
//
//        System.out.print(result);

//        int[] gain={-5,1,5,0,-7};
//        HighestAltitude highestAltitude=new HighestAltitude();
//        int high=highestAltitude.largestAltitude(gain);
//        System.out.println(high);

        int[][] image={
                {1,1,0},

                {1,0,1},
                {0,0,0}
        };

        FlipImage flipImage=new FlipImage();

        int[][] newarr=flipImage.flipAndInvertImage(image);

      System.out.println(newarr[0][2]);






        }






}
