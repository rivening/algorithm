class Solution {
    public int solution(int order) {
        String a = order + "" ;
        int answer = 0;
        for(char s : a.toCharArray()){
            if(s == '3' || s == '6' || s == '9')
                answer++;
        }
        return answer;
    }
}