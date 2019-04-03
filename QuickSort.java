
public class QuickSort {

   public static void quicksort(int[] array, int start, int end) {

	   if( start >= end) {
		   return;
	   }
	   int pivot = array[start];

     int head = start+1;
     int tail = end;

	   int index = partition(array, head, tail, pivot);
	   if(array[index] < array[start]) {
		   swap(array, start, index);

	   } else {
		   swap(array, start, index-1);
	   }

	   quicksort(array, start, index-1);
	   quicksort(array, index, end);
   }

   public static int partition(int[] array, int head, int tail, int pivot) {
       while(head <= tail){
  		   while(array[head] < pivot && head<tail) {
  			   head++;
  		   }

  		   while(array[tail] > pivot && head != tail) {
          //if(head == tail) break;
  			   tail--;
  		   }

         if(head<tail){
  		     swap(array, head, tail);
         }else if(head == tail){
           break;
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

   public static void main(String[] args) {

    int range = 40;
 		int min = 1;
 		int[] A = new int[11];
	   //int[] A = {15, 3, 2, 1, 9, 5, 7, 8, 6};
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
   }
}
