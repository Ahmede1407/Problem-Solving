class Solution {
    
ArrayList<String> finalArray = new ArrayList<String>();    
    
    public List<String> fizzBuzz(int n) {
        for(int i = 1; i <= n ; i++){
            
            if( i % 3 == 0 && i % 5 == 0 ){
                finalArray.add("FizzBuzz");
            }
            
            else if (i % 3 == 0){
                finalArray.add("Fizz");
            }
            
            else if (i % 5 == 0){
                finalArray.add("Buzz");
            }
            
            else {
                finalArray.add(Integer.toString(i));
            }
        }
        
        return finalArray;
    }
}