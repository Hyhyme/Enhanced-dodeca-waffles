/*======================================
  class MergeSortTester
  ALGORITHM:
  If the array has length 1, return the array. If not, split it in half, sort the two halves, and then merge them, and return that array.
  BIG-OH CLASSIFICATION OF ALGORITHM:
  O( nlogn )
  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1       time: ~4900
  n=10      time: ~16000
  n=100     time: ~93000
  n=1000    time: ~635000
  ...
  n=<huge>  time: 
  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
  ======================================*/

public class MergeSortTester 
{
    public static int[] populate(int[] a){
	for(int i = 0; i < a.length; i++){
	    a[i] = (int)(Math.random()*100);
	}
	return a;
    }

    /******************************
     * execution time analysis 
     * <INSERT YOUR DESCRIPTION HERE OF 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...> 
     ******************************/
    public static void main( String[] args ) 
    {
	long initial = 0;
	//int[] arr1 = new int[1];
      	//int[] arr2 = new int[10];
	//int[] arr3 = new int[100];
	int[] arr4 = new int[1000];
	//populate(arr1);
	//populate(arr2);
	//populate(arr3);
	populate(arr4);
	MergeSort test = new MergeSort();
	initial = System.nanoTime();
	//test.sort(arr1);
	//test.sort(arr2);
	//test.sort(arr3);
	test.sort(arr4);
	System.out.println(System.nanoTime()-initial);
	
    }//end main

}//end class
