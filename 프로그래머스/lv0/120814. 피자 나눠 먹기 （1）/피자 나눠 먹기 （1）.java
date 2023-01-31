class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int a=1; a<=n; a+=7)
    {
        answer = answer+1;
    }

        return answer;
    }
}