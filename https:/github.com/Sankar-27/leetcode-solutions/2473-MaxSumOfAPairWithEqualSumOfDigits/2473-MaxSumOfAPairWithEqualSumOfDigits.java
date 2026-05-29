// Last updated: 29/05/2026, 11:53:42
class Solution {
    public int maximumSum(int[] nums) {
        Map<Integer, int[]> map = new HashMap<>();
        int ans = -1;

        for (int num : nums) {
            int d = digitSum(num);

            // store top 2 max values for each digit sum
            if (!map.containsKey(d)) {
                map.put(d, new int[]{num, -1});
            } else {
                int[] arr = map.get(d);
                if (num > arr[0]) {
                    arr[1] = arr[0];
                    arr[0] = num;
                } else if (num > arr[1]) {
                    arr[1] = num;
                }
            }
        }

        for (int[] pair : map.values()) {
            if (pair[1] != -1) {
                ans = Math.max(ans, pair[0] + pair[1]);
            }
        }

        return ans;
    }

    private int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
