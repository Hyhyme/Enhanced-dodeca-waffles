# Enhanced-dodeca-waffles

APSC2 by Ishtiaque Mahdi, Edward Luo, Thomas Lin

#Description:

We are testing the runtime of MergeSort. MergeSort follows the following: If the array has length 1, return the array. If not, split it in half, sort the two halves, and then merge them, and return that array.

#Methodology:

We are testing the runtime by using a timer to measure how long it takes MergeSort to sort arrays of different lengths. By comparing the rate of change, we can determine the runtime of MergeSort.

#Findings/Analysis

 Run time is nlogn. In sort, it basically splits the array in half everytime until the array has length of 1. When we learned binary search, we discovered that it had a run time of logn. This is similar in that it splits the job in half repeatedly, as opposed to making two arrays, one with the first element and the second with the rest and splitting the array that way. But, merge has a runtime of n, because of the for loop that is based on the length of the arrays. So, the final runtime is nlogn. Our data supports our statement becuase as n increases, it follows the curve of the function y = nlogn.

Graphs on Google Doc: https://docs.google.com/document/d/1KbroAXramUEWdVxN3pHEr-zFpgQ4KLhmFHsYcQceTtY/pub
