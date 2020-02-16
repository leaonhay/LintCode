Find the Nth number in Fibonacci sequence.

A Fibonacci sequence is defined as follow:

The first two numbers are 0 and 1.
The i th number is the sum of i-1 th number and i-2 th number.
The first ten numbers in Fibonacci sequence is:

0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...

public class Solution {
    /**
     * @param n: an integer
     * @return: an ineger f(n)
     */
    public int fibonacci(int n) {
        // write your code here
        int sum[] = new int[n+1];
        sum[0] = 1;
        sum[1] = 0;
        for(int i = 1 ; i <= n; i++)
            if(i>1) sum[i] = sum[i-1] + sum[i-2];
        return sum[n];
    }
    
}

//递归会超时


