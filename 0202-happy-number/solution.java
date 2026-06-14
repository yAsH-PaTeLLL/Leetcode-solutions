class Solution {
    public boolean isHappy(int n) {
        int slow = n, fast = n;

        do {
            slow = getSum(slow);          // 1 step
            fast = getSum(getSum(fast));  // 2 steps
        } while (slow != fast);

        return slow == 1;
    }

    // your original inner while loop → just pulled into a helper
    private int getSum(int m) {
        int sum = 0;
        while (m > 0) {
            sum += Math.pow((m % 10), 2);
            m = m / 10;
        }
        return sum;
    }
}
