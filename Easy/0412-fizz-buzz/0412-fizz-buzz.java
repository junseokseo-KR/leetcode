class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>();
        for(int i=0;i<n;i++){
            result.add(getFizzAndBuzz(i+1));
        }
        return result;
    }
    
    String getFizzAndBuzz(int n){
        if(n%3==0 && n%5==0){
            return "FizzBuzz";
        } else if (n%3==0) {
            return "Fizz";
        } else if (n%5==0) {
            return "Buzz";
        } else {
            return Integer.toString(n);
        }
    }
}