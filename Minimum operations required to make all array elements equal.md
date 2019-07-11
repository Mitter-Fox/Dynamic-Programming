# Equal

Christy is interning at HackerRank. One day she has to distribute some chocolates to her colleagues. She is biased towards her friends and plans to give them more than the others. One of the program managers hears of this and tells her to make sure everyone gets the same number.

To make things difficult, she must equalize the number of chocolates in a series of operations. For each operation, she can give 1, 2 or 5 chocolates to all but one colleague. Everyone who gets chocolate in a round receives the same number of pieces.

For example, assume the starting distribution is [1, 1, 5]. She can give 2 bars to the first two and the distribution will be [3, 3, 5]. On the next round, she gives the same two  bars each, and everyone has the same number: [5, 5, 5].

Given a starting distribution, calculate the minimum number of operations needed so that every colleague has the same number of chocolates.

## Function Description

Complete the equal function in the editor below. It should return an integer that reperesents the minimum number of operations required.

equal has the following parameter(s):

**arr**: an array of integers to equalize
## Input Format

The first line contains an integer *_t_*, the number of test cases.

Each test case has **2** lines.
- The first line contains an integer *_n_*, the number of colleagues.
- The second line contains *_n_* space-separated integers denoting the number of chocolates each colleague has.

## Constraints
- *1 <= t <= 100*
- *1 <= n <= 1000*

Number of initial chocolates each colleague has <1000

## Output Format

Print the minimum number of operations needed for each test case, one to a line.

## Sample Input

1
4
2 2 3 7
## Sample Output

2
## Explanation

Start with [2, 2, 3, 7]
Add 1 to all but the 3rd element -> [3, 3, 3, 8]
Add 5 to all but the 4th element -> [8, 8, 8, 8]

Two operations were required.

## Sample Input 1

1
3
10 7 12
## Sample Output 1

3
## Explanation 1

Start with [10, 7, 12] 
Add  to the first two elements -> [15, 12, 12]
Add  to the last two elements -> [15, 14, 14]
Add  to the last two elements -> [15, 15, 15]

Three operations were required.

# Solution Hint:

## Things we need to think about it now:
1. Subtracting from 1 = Adding to all but 1
2. You can get any number due to +1 operation.
3. We should aim for the minimum numbers.
4. Sometimes the minimum will not be optimal, butbut it will be somewhere between min and min = 4.
