class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int nn = 0;
        
        for(int i=0; i<=n; i= i+10){
            nn = 2000*i/10;
        }
        
        answer =(n*12000+ k*2000 )- nn;
        return answer;
    }
}