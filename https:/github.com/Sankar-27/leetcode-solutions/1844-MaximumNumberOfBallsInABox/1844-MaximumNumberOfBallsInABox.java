// Last updated: 29/05/2026, 11:54:06
class Solution {
    public int countBalls(int lowLimit, int highLimit) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = lowLimit; i <= highLimit; i++) {
            int m = i;
            int sum = 0;
            while (m > 0) {
                int t = m / 10;
                int k = m % 10;
                m = m / 10;
                sum += k;
            }
            map.merge(sum, 1, Integer::sum);

        }
        List<Integer> list = map.entrySet().stream().sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .map(x -> x.getValue())
                .toList();
        return list.get(0);
    }
}