public class Solution {
    public static int trailingZeroes(int n) {
        int count=0;
        while(n>0) {//count the number of 5 since 5 and 2 makes up 10 and there is more 2 then 5 so count 5
            count = count + n / 5;
            n=n/5;
        }
        return count;
    }
}
