
public class SelectionSort {
	public static void main(String[] args) {
		
		int min, minindex, temp = 0, n, j;
		int[] A = {27, 7, 30, 40, 13};
		n = A.length;
		//System.out.println(n);
		
		for(int l=0; l<=n-1; l++) {
			System.out.print(A[l]+", ");	
		}
		System.out.println("");
		
		//Outer for loop tracking absolute min
		for(int i=0; i<n-1; i++) { // i<n-1 b/c n-1 will already be the largest value in sorted order.
			min = A[i];
			minindex = i;
			
			   //Finding the ith min
			   for(j=i+1; j<n; j++) {
				   if (A[j] < min) {
					   min = A[j];
					   minindex = j;
					   
					   /*
					   //Swapping w/o minindex
					   temp = A[i];
					   A[i] = A[j];
					   A[j] = temp;
					   */					  					  					   					   
				   }
			   }
			   
			   
			   //Swapping w/ minindex
			   temp = A[i];
			   A[i] = A[minindex];
			   A[minindex] = temp;
			   
		}
		for(int l=0; l<=n-1; l++) {
			System.out.print(A[l]+", ");
		}
		
	}
}


