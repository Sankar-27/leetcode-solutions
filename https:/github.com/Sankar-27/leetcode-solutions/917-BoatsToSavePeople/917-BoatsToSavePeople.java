// Last updated: 29/05/2026, 11:55:25
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count=0;
        int left=0,right=people.length-1;
        while(left<=right){
            if(people[left]+people[right]<=limit){
                left++;
                right--;
                count++;
            }
            else{
                right--;
                count++;
            }
        }
        return count;
    }
}