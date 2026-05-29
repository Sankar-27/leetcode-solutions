// Last updated: 29/05/2026, 11:57:15
class Solution {
     public static void main(String[]args){
        int n=5;
        System.out.println(fizzBuzz(n));
    }
    public static List<String> fizzBuzz(int n) {
           List<String> fizzbuzz=new ArrayList<>();
        for(int i=1;i<=n;i++) {
             if(i%3==0&&i%5==0){
                fizzbuzz.add("FizzBuzz");
            }
           else if(i%3==0){
               fizzbuzz.add("Fizz");
           } else if (i % 5 == 0) {
               fizzbuzz.add("Buzz");
           }
           else {
               fizzbuzz.add(String.valueOf(i));
           }
        }
        return fizzbuzz;
    }
}