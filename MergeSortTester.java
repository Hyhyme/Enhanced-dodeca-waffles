/*Enhanced-dodeca-waffles (Ishtiaque Mahdi, Edward Luo, Thomas Lin)
  APCS2 Pd 4
  HW #7 - What Does the Data Say? / Runtime Of MergeSort / Proving that MergeSort has a runtime of O(nlogn)
  2017 - 02 - 14
*/


/*======================================
  class MergeSortTester
  ALGORITHM:
  If the array has length 1, return the array. If not, split it in half, sort the two halves, and then merge them, and return that array.
  BIG-OH CLASSIFICATION OF ALGORITHM:
  O( nlogn )
  Mean execution times for dataset of size n:
  Batch size: 10
  n=1       time: 6743
  n=10      time: 17107
  n=100     time: 98643
  n=1000    time: 754284
  n=1000000   time: 263504136
  n=<1000000000>  time: 2135844987
  ANALYSIS:
  Run time is nlogn. In sort, it basically splits the array in half everytime until the array has length of 1. When we learned binary search, we discovered that it had a run time of logn. This is similar in that it splits the job in half repeatedly, as opposed to making two arrays, one with the first element and the second with the rest and splitting the array that way. But, merge has a runtime of n, because of the for loop that is based on the length of the arrays. So, the final runtime is nlogn. Our data supports our statement becuase as n increases, it follows the curve of the function y = nlogn. 
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
   We used System.nanoTime() to measure our execution time in nanoseconds. We initially wanted to use System.currentTimeMillis(), but the values of smaller sized arrays were so miniscule when we subtracted the initial time from EPOCH, it would result in zero. 
Since we are just testing the run time of the MergeSort alogrithm, we need an initial measure of time after running the populate methods and instantiating what we need. Then we run the MergeSort algorithm on an instantiated array, followed by printing out the current time minus the initial time, in order to find the time spent between the start of the MergeSort algorithm and the end. With this we can gather data and analyze how time increases in relation to array size.
     ******************************/
    public static void main( String[] args ) 
    {
	long initial = 0;
	int[] arr1 = new int[1000];
      	//int[] arr2 = new int[10000];
	//int[] arr3 = new int[100000];
	//int[] arr4 = new int[1000000];
	//int[] arr5 = new int[5000000];
	//int[] arr6 = new int[10000000];
	populate(arr1);
	//populate(arr2);
	//populate(arr3);
	//populate(arr4);
	//populate(arr5);
	//populate(arr6);
	MergeSort test = new MergeSort();
	initial = System.nanoTime();
	test.sort(arr1);
	//test.sort(arr2);
	//test.sort(arr3);
	//test.sort(arr4);
	//test.sort(arr5);
	//test.sort(arr6);
	System.out.println(System.nanoTime()-initial);
	
    }//end main

}//end class
