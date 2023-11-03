class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[a-z]|[A-Z]", "");
   
        for(char ch : my_string.toCharArray()){
            answer += Character.getNumericValue(ch);
        }

        return answer;
    }
}