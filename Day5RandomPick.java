LeetCode
Explore
Problems
Mock
Contest
Articles
Discuss
 Store 
 Premium
New Playground
9
chitra690
  Back to Chapter
  Random Pick with Weight

Solution
Given an array w of positive integers, where w[i] describes the weight of index i, write a function pickIndex which randomly picks an index in proportion to its weight.

For example, given an input list of values [1, 9], when we pick up a number out of it, the chance is that 9 times out of 10 we should pick the number 9 as the answer.

Example 1:

Input: 
["Solution","pickIndex"]
[[[1]],[]]
Output: [null,0]
Example 2:

Input: 
["Solution","pickIndex","pickIndex","pickIndex","pickIndex","pickIndex"]
[[[1,3]],[],[],[],[],[]]
Output: [null,0,1,1,1,0]
Explanation of Input Syntax:

The input is two lists: the subroutines called and their arguments. Solution's constructor has one argument, the array w. pickIndex has no arguments. Arguments are always wrapped with a list, even if there aren't any.

 

Constraints:

1 <= w.length <= 10000
1 <= w[i] <= 10^5
pickIndex will be called at most 10000 times.
Java	
1
class Solution 
2
{
3
    private int[] accSum;
4
    private int total;
5
    private Random rand;
6
​
7
    public Solution(int[] w) 
8
    {
9
        accSum = new int[w.length];
10
        rand = new Random();
11
        for (int i = 0; i< w.length; i++) 
12
        {
13
            total += w[i];
14
            accSum[i] = total; 
15
        }
16
    }
17
​
18
    public int pickIndex() 
19
    {
20
        int r = rand.nextInt(total) + 1;
21
        int start = 0, end = accSum.length - 1;
22
​
23
        while (start <= end) 
24
        {
25
            int mid = start + (end - start) / 2;
26
            if (accSum[mid] == r) 
27
            {
28
                return mid;
29
            } 
30
            else if (accSum[mid] > r) 
31
            {
32
                end = mid - 1;
33
            } 
34
            else 
35
            {
36
                start = mid + 1;
37
            }
38
        }
39
        return start;
40
    }
41
}
42
​
43
/**
44
 * Your Solution object will be instantiated and called as such:
45
 * Solution obj = new Solution(w);
46
 * int param_1 = obj.pickIndex();
47
 */
  Custom Testcase( Contribute  )
