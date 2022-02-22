package leetCode;

import java.sql.Array;
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

//        int[][] image={
//                {1,1,0},
//
//                {1,0,1},
//                {0,0,0},
//
//        };

//        FlipImage flipImage=new FlipImage();
//
//        int[][] newarr=flipImage.flipAndInvertImage(image);
//
//      for(int i=0;i<newarr.length;i++){
//          for(int j=0;j< newarr.length;j++){
//              System.out.print(newarr[i][j]+",");
//          }
//          System.out.println(" ");
//      }


        //Diagonal Sum

//        int[][] arr={
//                {7,3,1,9},
//                {3,4,6,9},
//                {6,9,6,6},
//                {9,5,8,5}
//
//        };
//
//
//        DiagonalSum diagonalSum=new DiagonalSum();
//
//        int result=diagonalSum.diagonalSum(arr);
//        System.out.println(result);


//        int[] nums={555,901,482,1771};
//    EvenNumberDigits evenNumberDigits=new EvenNumberDigits();
//    int counter=evenNumberDigits.findNumbers(nums);
//    System.out.println(counter);


//        int[][] arr={
//                {1,2,3},
//                {4,5,6},
//
//        };
//
//        TransposeMatrix transposeMatrix=new TransposeMatrix();
//        int[][] newArr=transposeMatrix.transpose(arr);
//
//        for(int i=0;i<newArr.length;i++){
//            for(int j=0;j< newArr[0].length;j++){
//                System.out.print(newArr[i][j]+",");
//
//            }
//            System.out.println(" ");
//        }

//        int[] arr={1,2,3,4};
//        ArrayToInteger arrayToInteger=new ArrayToInteger();
//        List<Integer> list=arrayToInteger.addToArrayForm(arr,1);
//        System.out.println(Arrays.toString(list.toArray()));


//        int[][] arr303={
//                {1982,1998},
//                {2013,2042},
//                {2010,2035},
//                {2022,2050},
//                {2047,2048}
//
//
//        };
//    MaxPopYear maxPopYear=new MaxPopYear();
//    int year=maxPopYear.maximumPopulation(arr303);
//    System.out.println(year);

//        int[][] arrRot={
//                {0,0,0},
//                {0,1,0},
//                {1,1,1}
//        };
//
//        int[][] target={
//                {1,0},
//                {0,1}
//        };
//
//
//        FindRotation findRotation=new FindRotation();
//         boolean result=findRotation.findRotation(arrRot,target);

//        SumZero sumZero=new SumZero();
//
//        int[] arr= sumZero.sumZero(5);
//
//        System.out.println(Arrays.toString(arr));
//        int[][] matrix={
//                {3,6},
//                {7,1},
//                {5,2},
//                {4,8}
//        };
//        LuckyNumber luckyNumber=new LuckyNumber();
//        List<Integer> li=luckyNumber.luckyNumbers(matrix);
////        System.out.println(li.get(0));

//        int[][] nums={
//                {1,2},
//
//        };
//
//        ReshapeMatrix reshapeMatrix=new ReshapeMatrix();
//        int[][] matrix=reshapeMatrix.matrixReshape(nums,1,1);
//        for(int[] row:matrix){
//            System.out.println(Arrays.toString(row));
//        }

//        int[] num={1,2,2,2,2};
//        PlusOne plusOne=new PlusOne();
//        int[] arr=plusOne.plusOne(num);
//        System.out.println(Arrays.toString(arr));

//        DuplicatesArray duplicatesArray=new DuplicatesArray();
//        int len=duplicatesArray.removeDuplicates(num);

//        MinimumChips minimumChips=new MinimumChips();
//        int cost=minimumChips.minCostToMoveChips(num);
//
//        System.out.println(cost);

        int[][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        SpiralMatrix spiralMatrix=new SpiralMatrix();
        List<Integer> list=spiralMatrix.spiralOrder(arr);
        System.out.print(Arrays.toString(list.toArray()));
    }

}
