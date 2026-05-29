// Last updated: 29/05/2026, 11:55:53
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<stones.length();i++){
            map.put(stones.charAt(i),map.getOrDefault(stones.charAt(i),0)+1);
        }
        for(int i=0;i<jewels.length();i++){
            char ch=jewels.charAt(i);
            if(map.containsKey(ch))
                count+=map.get(ch);
        }
        return count;
    }
}