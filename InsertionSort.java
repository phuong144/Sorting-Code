
public class InsertionSort {
   public static void main(String[] args) {
	   
	   int temp=0, n, j=0;
	   int[] A = {27, 42, 15, 3};
	   n = A.length;
	   
	   for(int p=0; p<n; p++) {
		      System.out.print(A[p]+", ");
	   }
	   System.out.println("");
	   
	   for(int i=1; i<n; i++) {
		   j=i;
		   while( j>0 && A[j-1]>A[j]) {
			   temp = A[j-1];
			   A[j-1] = A[j];
			   A[j] = temp;
			   j -=1;
					 
		   }
	   }
	   
	   for(int i=0; i<n; i++) {
	      System.out.print(A[i]+", ");
       }
   }
}
