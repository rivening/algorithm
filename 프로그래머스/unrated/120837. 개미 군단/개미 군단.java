class Solution {
    public int solution(int hp) {
        int answer = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        
        a = hp / 5;
        b = (hp % 5) / 3;
        c = hp - (5*a) - (3*b) ;
        
        answer = a + b + c ;
        
        return answer;
    }
}