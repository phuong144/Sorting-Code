
public class MergeSort {
			
	public static void main(String[] args) {
		int[] A = {1, 0 , 7, 4, 9, 5};
		
		for(int i=0; i<A.length; i++) {
			System.out.print(A[i] + ", ");
		}
		System.out.println("");
		int[] S = Mergesort(A);
		
		for(int i=0; i<A.length; i++) {
			System.out.print(S[i] + ", ");
		}					
	}
			
	public static int[] Mergesort(int[] Array) {
		
		int[] Lsort, Rsort; //Arrays to be sorted
		int n = Array.length;
		int r = (Array.length - 1);
		int middle = r / 2; 
		int Lsize = middle + 1;
		int Rsize = n - Lsize;
		int[] left = new int[Lsize];
		int[] right = new int[Rsize];
		
		if( n == 1) {
			return Array;
		}
		
		for(int i=0; i<Lsize; i++) {
			left[i] = Array[i];
		}		
		
		for(int j= 0; j< Rsize; j++){
			right[j] = Array[Lsize + j];						
		}
		
		Lsort = Mergesort(left);
		Rsort = Mergesort(right);
		
		return Merge(Lsort, Rsort,Lsize, Rsize);
		
	}
	
	public static int[] Merge(int[] A, int[] B, int lsize, int rsize) {
		
		int i=0; //index in A
		int j=0; //index in B
		int k=0; //index in C
		int[] C = new int[A.length + B.length];
		
		while(i < lsize && j < rsize) {
			if(A[i] < B[j]) {
				C[k] = A[i];
				i++;
			}else {
				C[k] = B[j];
				j++;
			}
			k++;		
		}
		
		while(i < lsize) {
			C[k] = A[i];
			i++;
			k++;
		}
		
		while(j < rsize) {
			C[k] = B[j];
			j++;
			k++;
		}
		return C;
	}
}
