class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        
        for (int j=1; j<=n ; j++){
            cnt = 0;
            for(int i=1; i * i <= j; i++){
                if( i * i == j) cnt ++;
                else if (j % i == 0) cnt += 2;

            }   if(cnt >=3)
                answer++;
                 
        }
        return answer;
    }
}