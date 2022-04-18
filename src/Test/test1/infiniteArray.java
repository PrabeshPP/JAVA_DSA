package Test.test1;





    public  class infiniteArray {
        public static void main(String[] args) {
            int[] arr = {3, 5, 6, 7, 8, 9, 11, 12, 45, 67, 89};
            int target = 11;
            System.out.println(findingRange(arr, 11));
        }

        static int findingRange(int[] arr, int target) {
            int start = 0;
            int end = 1;
            while (target > arr[end]) {
                System.out.println(target+""+arr[end]);
                int newsStart = end + 1;
                end = end + (end - start + 1) * 2;
                start = newsStart;
            }
            return element(arr, target, start, end);
        }

        static int element(int[] arr, int target, int start, int end) {
            while (start <= end) {
                int mid = start + (end - start) / 2; // might be possible that start + end exceeds the range of int in java. so might get some error
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }
    }

