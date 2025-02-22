# Scope

Objective

Today we're discussing scope.

The absolute difference between two integers, a and b, is written as | a - b |. The maximum absolute difference between two integers in a set of positive integers, elements, is the largest absolute difference between any two integers in elements.

The Difference class is started for you in the editor. It has a private integer array (elements) for storing N non-negative integers, and a public integer (maximumDifference) for storing the maximum absolute difference.


Task

Complete the Difference class by writing the following:

1. A class constructor that takes an array of integers as a parameter and saves it to the elements instance variable.
2. A computeDifference method that finds the maximum absolute difference between any 2 numbers in N and stores it in the maximumDifference instance variable.


Input Format

You are not responsible for reading any input from stdin. The locked Solution class in your editor reads in 2 lines of input; the first line contains N, and the second line describes the elements array.


Output Format

You are not responsible for printing any output; the Solution class will print the value of the maximumDifference instance variable.


Sample Input
<pre>
3
1 2 5
</pre>

Sample Output
<pre>
4
</pre>

Explanation

The scope of the elements array and maximumDifference integer is the entire class instance. The class constructor saves the argument passed to the constructor as the elements instance variable (where the computeDifference method can access it).

To find the maximum difference, computeDifference checks each element in the array and finds the maximum difference between any 2 elements: 
<pre>
| 1 - 2 | = 1
| 1 - 5 | = 4
| 2 - 5 | = 3
</pre>
The maximum of these differences is 4, so it saves the value 4 as the maximumDifference instance variable. The locked stub code in the editor then prints the value stored as maximumDifference, which is 4.