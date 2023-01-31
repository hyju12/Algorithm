class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        
        for(int n=0; n< numbers.length; n++)
        {
            answer += numbers[n] ;
        }
        answer = answer/numbers.length ;
        
        return answer;
    }
}