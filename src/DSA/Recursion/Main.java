package DSA.Recursion;
//Recursion in Java
//Recursion needs a lot of time to grasp the concept
public class Main {
    public static void main(String[] args) {
        //write a function that prints hello world
        //Print the number from 1 to 5 using recursive method
//        print(1);
//        FibonacciNumber fibonacciNumber=new FibonacciNumber();
//        int result=fibonacciNumber.fibo(7);
//        System.out.println(result);

//        int[] arr={1,2,3,4,5,6,7,8};
//        BinarySearch binarySearch=new BinarySearch();
//        int result=binarySearch.search(arr,3,0,arr.length-1);
//        System.out.println(result);

    }

    static void print(int times){
        if(times==6){
            return;
        }
        System.out.println(times);
        print(times+1);
    }
}
