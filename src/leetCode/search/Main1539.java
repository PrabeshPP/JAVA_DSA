package leetCode.search;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main1539 {
    public static void main(String[] args) {
//        int[] arr={1,3,5,6};
////        MissingInteger missingInteger=new MissingInteger();
////        int missingInteger1=missingInteger.findKthPositive(arr,5);
////        System.out.println(missingInteger1);
//
//        SearchInsertPosition searchInsertPosition=new SearchInsertPosition();
//        int pos=searchInsertPosition.searchInsert(arr,7);
//        System.out.println(pos);


//        int [][] matrix={
//                {3,2},
//                {-3,-3},
//                {-3,-3},
//                {-3,-3}
//        };

//        CountNegative countNegative=new CountNegative();
//        int counter=countNegative.countNegatives(matrix);
//        System.out.println(counter);
//        int[] arr1={1,2};
//        int[] arr2={1,1};
//        IntersectionArray intersectionArray=new IntersectionArray();
//       int[] arr= intersectionArray.intersection(arr1,arr2);
//       System.out.println(Arrays.toString(arr));

//        int[][] matrix={
//                {1,3,5,7},
//                {10,11,16,20},
//                {23,30,34,50}
//        };
//
//        Search2DMatrix search2DMatrix=new Search2DMatrix();
//        boolean result=search2DMatrix.searchMatrix(matrix,5);
//        System.out.println(result);

//        int[] nums2={1,2,5};
//        int[] nums1={2,4};

//        IntersectionArrayII intersectionArrayII=new IntersectionArrayII();
//        int[] arr=intersectionArrayII.intersection(nums1,nums2);
//        System.out.println(Arrays.toString(arr));
//
//        FairCandySwap fairCandySwap=new FairCandySwap();
//        int[] resultantArr=fairCandySwap.fairCandySwap(nums1,nums2);
//        System.out.println(Arrays.toString(resultantArr));

//        int[][] matrix={
//                {1,0,0,0},
//                {1,1,1,1},
//                {1,0,0,0},
//                {1,0,0,0},
//        };
//
//        WeakestRows weakestRows=new WeakestRows();
//        int[] resulArr=weakestRows.kWeakestRows(matrix,2);
//        System.out.println(Arrays.toString(resulArr));
//        int[] arr={1,2,5,2,3};
////        DoubleExist doubleExist =new DoubleExist();
//        boolean exist=doubleExist.checkIfExist(arr);
//        System.out.println(exist);

//        SpecialArray specialArray=new SpecialArray();
//        int result=specialArray.specialArray(arr);
//        System.out.println(result);


//        TargetIndices targetIndices=new TargetIndices();
//        List<Integer> list=targetIndices.targetIndices(arr,5);
//        System.out.println(Arrays.toString(list.toArray()));


//        int[][] matrix={
//                {1,4,7,11,5},
//                {2,5,8,12,19},
//                {3,6,9,16,22},
//                {10,13,14,17,24},
//                {18,21,23,26,30}
//        };
//
//        Search2DMatrixII search2DMatrixII=new Search2DMatrixII();
//        boolean result =search2DMatrixII.searchMatrix(matrix,8);
//        System.out.println(result);

//        int[] nums={3,3,7,7,10,11,11};
//        SearchRotatedArrayII searchRotatedArrayII=new SearchRotatedArrayII();
//        boolean result=searchRotatedArrayII.search(nums,3);
//        System.out.println(result);

//        MinRotatedArray minRotatedArray=new MinRotatedArray();
//        int result= minRotatedArray.findMin(nums);
//        System.out.println(result);
//
//        SingleElement singleElement=new SingleElement();
//        int result =singleElement.binarySearch(nums);
//        System.out.println(result);

//        int[] nums={4,5,6,7,0,1,4};
//        MinRotatedArrayII minRotatedArrayII=new MinRotatedArrayII();
//        int result = minRotatedArrayII.findMin(nums);
//        System.out.println(result);
        //


        int[][] matrix={
                {10,50,40,30,20},
                {1,500,2,3,4},

        };

        PeakElementII peakElementII=new PeakElementII();
        int[] resultArr=peakElementII.findPeakGrid(matrix);
        System.out.println(Arrays.toString(resultArr));





    }
}
