package DSA;

public class Main {
    public static void main(String[] args) {
        // Bubble Sorting in Java
        BubbleSort bubbleSort=new BubbleSort();
        int[] list={22,1,55,3,7,10,99,34,20};
        int[] list1= bubbleSort.bubblesort(list);
        System.out.println(list1[list1.length-1]);

    }
}
