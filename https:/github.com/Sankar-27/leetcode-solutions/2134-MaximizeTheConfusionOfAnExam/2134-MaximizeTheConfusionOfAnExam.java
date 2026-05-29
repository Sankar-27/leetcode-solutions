// Last updated: 29/05/2026, 11:53:51
class Solution {
    public int maxConsecutiveAnswers(String answerkey, int k) {
        int max=0,l,countt=0,countf=0,si=0;
        for(int li=0;li<answerkey.length();li++){
            if(answerkey.charAt(li)=='T')
                countt++;
            else
                countf++;
            while(Math.min(countt,countf)>k){
                if(answerkey.charAt(si)=='T'){countt--;}
                else{countf--;}
                si++;
            }
            l=li-si+1;
            if(l>max)
                max=l; 
        }
        return max;
    }
}