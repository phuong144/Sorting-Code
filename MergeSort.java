import java.util.*;
public class MergeSort {

	public static int[] Mergesort(int[] Array) {

		if( Array.length == 1) {
			return Array;
		}

		int[] Lsorted, Rsorted; //Arrays to be sorted

		int r = (Array.length - 1);
		int l = 0;
		int middle = l + (r-l)/2;

		int Lsize = middle + 1;
		int Rsize = r - middle;

		int[] left = new int[Lsize]; // Need to split half of array to do recursion on each half
		int[] right = new int[Rsize];

		for(int i=0; i<Lsize; i++) {
			left[i] = Array[i];
		}

		for(int j= 0; j< Rsize; j++){
			right[j] = Array[Lsize + j];
		}

		Lsorted = Mergesort(left); // Recursively call on each half
		Rsorted = Mergesort(right);

		return Merge(Lsorted, Rsorted,Lsize, Rsize);

	}

	public static int[] Merge(int[] A, int[] B, int lsize, int rsize) {

		int i=0; //index in A
		int j=0; //index in B
		int k=0; //index in C
		int[] C = new int[lsize + rsize];

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

	public static void main(String[] args) {

		int range = 40;
		int min = 1;
		int[] A = new int[11];
		for(int i=0; i<11; i++){
			A[i] = (int) ((Math.random() * range) + min);
		}

		for(int i=0; i<A.length; i++) {
			System.out.print(A[i] + ", ");
		}
		System.out.println("");
		int[] S = Mergesort(A);

		for(int i=0; i<A.length; i++) {
			System.out.print(S[i] + ", ");
		}
	}
}
