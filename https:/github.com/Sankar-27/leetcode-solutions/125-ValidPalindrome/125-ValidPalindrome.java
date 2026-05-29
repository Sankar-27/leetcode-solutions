// Last updated: 29/05/2026, 11:59:17
class Solution {
    public boolean isPalindrome(String str) {
        String s=str.toLowerCase();
    String nums = s.replaceAll("[,;\\)\\(\\`.:!? @#\\-$%^&_\\[\\]{}'\"\\\\]","");
        int flag=0;
	    int left=0,right=nums.length()-1;
	    while(left<right){
	        if(!(nums.charAt(left)==nums.charAt(right)))
	            return false;
	       left++;
	       right--;
	    }
	    return true;
    }
}