// Last updated: 29/05/2026, 11:56:54
class Solution {
    public int[] constructRectangle(int area) {
        int W = (int)Math.sqrt(area);

        while(area % W != 0){
            W--;
        }
        int L = area / W;
        return new int[]{L, W};
    }
}