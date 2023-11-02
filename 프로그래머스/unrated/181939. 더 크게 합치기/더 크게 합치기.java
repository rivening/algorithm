class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String one = String.valueOf(a) + String.valueOf(b);
        String two = String.valueOf(b) + String.valueOf(a);
        
        if (Integer.parseInt(one) > Integer.parseInt(two)){
            answer = Integer.parseInt(one);
        }else answer = Integer.parseInt(two);
        
        return answer;
    }
}