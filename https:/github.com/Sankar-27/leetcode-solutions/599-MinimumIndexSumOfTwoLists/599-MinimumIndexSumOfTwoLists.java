// Last updated: 29/05/2026, 11:56:29
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
       List<Integer> in = new ArrayList<>();
       for(int i=0;i<list1.length;i++)
       {
         for(int j=0;j<list2.length;j++)
         {
            if(list1[i].equals(list2[j]))
            {
                in.add(i+j);
            }
         }
       }
       Collections.sort(in);
       int min=in.get(0);
       List<String> in1 = new ArrayList<>();
         for(int i=0;i<list1.length;i++)
       {
         for(int j=0;j<list2.length;j++)
         {
            if((i+j)==min && list1[i].equals(list2[j]))
            {
                in1.add(list1[i]);
            }
         }
       }
       String arr[] = new String[in1.size()];
       for(int i=0;i<in1.size();i++)
       {
         arr[i]=in1.get(i);
       }
       return arr;
    }
}