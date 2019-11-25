/*
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:
Input: 123
Output: 321

Example 2:
Input: -123
Output: -321

Example 3:
Input: 120
Output: 21
*/

class Solution {
    public int reverse(int x) {
        int rev = 0;
        //10 을 통한 나머지와 나누기
        while (x != 0) {
            int pop = x % 10; 
            x /= 10;             
            // Integer.MAX_VALUE : 32비트 최대 정수값을 나타냄( 2147483647)
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            // Integer.MIN_VALUE : 최소 정수값 ( -2147483648)
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop; 
        }
        return rev;
    }
}