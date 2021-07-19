public class QuickSort1 {

    private static void quicksort(int[] nums, int left, int right) {
        if (left < right) {
            int index = partition(nums, left, right);
            quicksort(nums, left, index-1);
            quicksort(nums, index+1, right);
        }
    }
    
    private static int partition(int[] nums, int start, int end) {
        int i = start + 1;
        int pivotValue = nums[start];
        for (int j=i; j<=end; j++) {
            if (nums[j] < pivotValue) {
                swap(nums, i, j);
                i++;
            }
        }
        swap(nums, start, i-1);
        return i-1;
    }
    
    private static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public static void main(String[] args) {
        int range = 40;
 		int min = 1;
 		int[] A = new int[11];
	    //int[] A = {33, 33, 39, 26, 23, 36, 23, 30, 20, 33, 15};

        for (int j=0; j<5; j++) {
            for(int i=0; i<11; i++){
                A[i] = (int) ((Math.random() * range) + min);
            }
           //int[] A = {5, 7, 3, 2, 4, 1};
           //int[] A = {4,1,2,3};
           int start =  0;
           int end = A.length - 1;
   
           for(int i=0; i<A.length; i++) {
               System.out.print(A[i] + ", ");
           }
           System.out.println("");
   
           quicksort(A ,start, end);
   
           for(int i=0; i<A.length; i++) {
               System.out.print(A[i] + ", ");
           }
           System.out.println("");
        }
    }
}
