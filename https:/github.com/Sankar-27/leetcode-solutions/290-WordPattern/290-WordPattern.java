// Last updated: 29/05/2026, 11:57:46
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        String[] arr = s.split(" ");
        if(pattern.length()==arr.length){
            for(int i=0;i<pattern.length();i++){
                char c=pattern.charAt(i);
                String word=arr[i];
                if(map.containsKey(c)){
                    if(!map.get(c).equals(word))    return false;
                }else{
                    if(map.containsValue(word))     return false;
                    map.put(c, word);
                }
            }
            return true;
        }
        else
            return false;
    }
}