class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String one = String.valueOf(a) + String.valueOf(b);
        int two = 2 * a * b;
        
        if (Integer.parseInt(one) > two){
            answer = Integer.parseInt(one);
        }else answer = two;
        
        return answer;
    }
}