/*Ishtiaque Mahdi
APCS2 pd 4
HW 6 - Step 1: Split, Step 2: ?, Step 3: Sorted! / MergeSort / Coding the mergesort algorithm we talked about in class.
2017 - 2 - 12

/*======================================
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm: The algorith works by first checking how many elements are in the array. If there is one element, return the same array. If not, split the array in half and give it to another sort method. Once those methods are done evaluating, you take their outputs and merge the array by comparing indexes in increasing order. If you hapen to finish iterating through one array one, you can add the rest of array two beacuse we are assuming that we are given sorted arrays. After we are done merging, we have a sorted array increasing from smallest to largest. 
Note: I thought that MergeSort would also have a runtime of O(n^2) but it apprantly has a runtime of O(nlogn) 

  ======================================*/

public class MergeSort {

   /******************************************************
     * int[] merge(int[],int[]) 
     * Merges two input arrays
     * Precond:  Input arrays are sorted in ascending order
     * Postcond: Input arrays unchanged, and 
     * output array sorted in ascending order.
     ******************************************************/
    private static int[] merge( int[] a, int[] b ) 
    {
	int[] output = new int[(a.length + b.length)];
	int a1 = 0;
	int b1 = 0;
	for (int i = 0; i < (a.length + b.length); i++){
	    //  System.out.println("start");
	    if ( a1 >= a.length) {
		output[i]= b[b1];
		b1 += 1;
		//	printArray(output);
		//  	           System.out.println("start1");


	    }
	    else if (b1 >= b.length) {
		output[i]=a[a1];
		a1 +=1;
		//	printArray(output);
		//		    System.out.println("star2t");


	    }	    
	    else  if (a[a1] >= b[b1]){
		output[i] = b[b1];
		b1 += 1;
		//	printArray(output);
		//		    System.out.println("star3t");

	    }
	    else {
		output[i] = a[a1];
		//		    System.out.println("star4t");

		a1 += 1;
	    }
	}
	//   System.out.println("end");

	return output;
	     
    }//end merge()


    /******************************************************
     * int[] sort(int[]) 
     * Sorts input array using mergesort algorithm
     * Returns sorted version of input array (ascending)
     ******************************************************/
    public static int[] sort( int[] arr ) 
    {
	int[] output = new int[arr.length];
	if (arr.length < 2){
	    return arr;
	}
	else{
	    int[] a = new int[arr.length/2];
	    int[] b = new int[arr.length-a.length];//need this because 2 might not divide evenly.
	    for (int i = 0; i < a.length; i++){
		a[i] = arr[i];
	    }
	    for (int i = 0; i < b.length; i++){
		b[i] = arr[i+(arr.length)/2];
	    }
	    output = merge(sort(a),sort(b));
	}
	return output;
    }//end sort()



    //-------------------HELPERS-------------------------
    //tester function for exploring how arrays are passed
    //usage: print array, mess(array), print array. Whaddayasee?
    public static void mess( int[] a ) {
	for( int i = 0 ; i<a.length; i++ )
	    a[i] = 0;
    }

    //helper method for displaying an array
    public static void printArray( int[] a ) {
	System.out.print("[");
	for( int i : a )
	    System.out.print( i + ",");
	System.out.println("]");
    }
    //---------------------------------------------------


    //main method for testing
    public static void main( String [] args ) {

	int[] arr0 = {0};
	int[] arr1 = {1};
	int[] arr2 = {1,2};
	int[] arr3 = {3,4};
	int[] arr4 = {1,2,3,4};
	int[] arr5 = {4,3,2,1};
	int[] arru = {9,10,11,12,13,14,15};
	int[] arr6 = {9,42,17,63,0,512,23};
	int[] arr7 = {9,42,17,63,0,9,512,23,9};

	System.out.println("\nTesting mess-with-array method...");
	printArray( arr3 );
	mess(arr3);
	printArray( arr3 );

	System.out.println("\nMerging arr1 and arr0: ");
	printArray( merge(arr1,arr0) );

	System.out.println("\nMerging arr4 and arr6: ");
	printArray( merge(arr4,arr6) );

	System.out.println("\nSorting arr4-7...");
	printArray( sort( arr4 ) );
	printArray( sort( arr5 ) );
	printArray( sort( arr6 ) );
	printArray( sort( arr7 ) );
		/*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~

	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }//end main()

}//end class MergeSort

