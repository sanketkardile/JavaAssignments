package iNeuronStrings;

import java.util.*;

class Assignment2{
	void arrayDuplicates() {
		int[]arr= {3,4,6,6,4,2,7,3,8};
		for(int i: arr)  System.out.print(i+" ");
		Arrays.sort(arr);
		Stack<Integer>stack= new Stack<Integer>();
		Set<Integer>set=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(i==0) stack.push(arr[i]);
			if(stack.peek()!=arr[i]) 
				stack.push(arr[i]);
			else
				set.add(arr[i]);	
		}
		System.out.print("Duplicates present in array are: ");
		for(int i: set)  System.out.print(i+" ");
		
	}
	
	void bubbleSort(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.print("-After Bubble sort array is:");
		for(int i:arr) System.out.print(i+" ");
	}
	int partition(int low,int high, int[]arr) {
		int i=low-1;
		int pivot=high;
		for(int j=low;j<high;j++) {
			if(arr[j]<arr[pivot]) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		i++;
		int temp=arr[i];
		arr[i]=arr[high];
		arr[high]=temp;
		return i;
	}
	void quickSort(int low,int high, int[]arr){
		if(low<high) {
		int pivotIndex= partition(low,high,arr);
		quickSort(low,pivotIndex-1,arr);
		quickSort(pivotIndex+1,high,arr);
		}
		
	}
	
	void subArray(int[]A,int[]B) {
		int n=A.length;
		int m= B.length;
		int j=0;
		for(int i=0;i<n;i++) {
			if(A[i]==B[j]) {
				j++;
				if(j==m) {
					System.out.println("SubArray is Present in given Array");
					return;
				}
				
			}
			else j=0;
		}
		
		System.out.println("SubArray is not Present in given Array");
	}
	
	void merge(int[] a,int[] l,int[] r,int left,int right) {
			 
			    int i = 0, j = 0, k = 0;
			    while (i < left && j < right) {
			        if (l[i]<=r[j]) {
			            a[k++]=l[i++];
			        }
			        else {
			            a[k++]=r[j++];
			        }
			    }
			    while (i < left) {
			        a[k++] = l[i++];
			    }
			    while (j < right) {
			        a[k++] = r[j++];
			    }
			}
	
	void mergeSort(int[] a, int n) {
	    if (n < 2) {
	        return;
	    }
	    int mid = n / 2;
	    int[] l = new int[mid];
	    int[] r = new int[n - mid];

	    for (int i = 0; i < mid; i++) {
	        l[i] = a[i];
	    }
	    for (int i = mid; i < n; i++) {
	        r[i - mid] = a[i];
	    }
	    mergeSort(l, mid);
	    mergeSort(r, n - mid);

	    merge(a, l, r, mid, n - mid);
	}
	
	void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
}



public class Sorting {

	public static void main(String[] args) {
		//Duplicates present in array
		Assignment2 sanket= new Assignment2();
		sanket.arrayDuplicates();
		int[] arr= {3,4,9,5,2,8};
		System.out.println();
		System.out.print("Unsorted array:");
		for(int i: arr) System.out.print(i +" ");
		//Bubble Sort
		sanket.bubbleSort(arr);
		int[] arr2= {3,4,9,5,2,8};
		System.out.println();
		System.out.print("-After quickSort arr:");
		//Quick Sort
		sanket.quickSort(0,arr2.length-1,arr2);
		for(int i: arr2) System.out.print(i +" ");
		//Merge Sort
		int[] arr3= {3,4,9,5,2,8};
		System.out.println();
		System.out.print("-After mergeSort arr:");
		sanket.mergeSort(arr3,arr3.length);
		for(int i: arr3) System.out.print(i +" ");
		//Selection Sort
		int[] arr4= {3,4,9,5,2,8};
		System.out.println();
		System.out.print("-After selectionSort arr:");
		sanket.selectionSort(arr4);
		for(int i: arr3) System.out.print(i +" ");
		//SubArray
		int[]Array= {3,2,4,7,2,8,9,5,3,2};
		int[]subArray= {7,2,8,9};
		System.out.println();
		System.out.print("Array:");
		for(int i: Array) System.out.print(i+" ");
		System.out.print("subArray:");
		for(int i: subArray) System.out.print(i+" ");
		sanket.subArray(Array, subArray);
		
	}


}
