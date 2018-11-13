
public class QuickSort {
   public static void main(String[] args) {	   	   
	   
	   int[] A = {15, 3, 2, 1, 9, 5, 7, 8, 6};
	   //int[] A = {5, 7, 3, 2, 4, 1};
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
   }
   
   public static void quicksort(int[] array, int start, int end) {
	    
	   if( start == end || start>end) {
		   return;
	   }	   	   
	   int pivot = array[0];
	   int head = 1;
	   
	   int index = partition(array, head, end, pivot);
	   if(array[index] < array[0]) {
		   swap(array, 0, index);
		   
	   } else {
		   swap(array, 0, index-1);		   
	   }
	   
	   quicksort(array, 0, index-1);
	   quicksort(array, index + 1, end);
   }
   
   public static int partition(int[] array, int head, int tail, int pivot) {
	   while(head < tail) {   	
		   
		   while(array[head] < pivot && head < tail) {
			   head++;			   			   
		
		   }
		   
		   
		   
		   while(array[tail] > pivot && head < tail) {
               //if(head == tail) break;
			   tail--;
		   }   			 
		   
		   if(head < tail) {
		   swap(array, head, tail);
		   head++;
		   tail--;
		   
		   }
	   }
	   return tail;

   }
   
   public static void swap(int[] array, int head, int tail) {
	   int temp;
	   temp = array[head];
	   array[head] = array[tail];
	   array[tail] = temp;
   }
}
