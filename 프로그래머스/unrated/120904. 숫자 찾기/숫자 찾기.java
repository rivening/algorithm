class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String s =  Integer.toString(num);
        String a = Integer.toString(k);
        
        if(s.indexOf(a) == -1){
            answer = -1;
        } else
            answer = s.indexOf(a) + 1;
        return answer;
    }
}