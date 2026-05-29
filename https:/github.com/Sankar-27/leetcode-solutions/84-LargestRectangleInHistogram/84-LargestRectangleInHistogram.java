// Last updated: 29/05/2026, 11:59:47
class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            int currHeight = (i == n) ? 0 : heights[i];

            while (!s.isEmpty() && currHeight < heights[s.peek()]) {
                int mid = s.pop();
                int left = s.isEmpty() ? -1 : s.peek();
                int width = i - left - 1;
                maxArea = Math.max(maxArea, heights[mid] * width);
            }

            s.push(i);
        }

        return maxArea;
    }
}