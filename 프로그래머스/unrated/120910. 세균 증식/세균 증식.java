class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        int cnt = 0;
        while(cnt != t){
            n = n*2;
            cnt++;
        }
        answer = n;
        return answer;
    }
}