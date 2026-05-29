// Last updated: 29/05/2026, 11:56:48
class Solution {
    public String[] findWords(String[] words) {
        char[] ch1={'q','w','e','r','t','y','u','i','o','p'};
        char[] ch2={'a','s','d','f','g','h','j','k','l'};
        List<Character> l1=new ArrayList<>();
        for(char c:ch1)l1.add(c);
        List<Character> l2=new ArrayList<>();
        for(char c:ch2)l2.add(c);
        List<String> list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String str=words[i].toLowerCase();
            char[] ch3=str.toCharArray();
            int c1=0,c2=0,c3=0;
            for(char c:ch3){
                if(l1.contains(c))c1++;
                else if(l2.contains(c))c2++;
                else c3++;
            }
            if(c3==ch3.length||c2==ch3.length||c1==ch3.length)list.add(words[i]);
        }
        return list.toArray(new String[0]);
    }
}