class Solution {
    public String solution(String my_string) {

        String answer = "";

        for (char x : my_string.toCharArray()) {
          if (Character.isLowerCase(x)) answer += Character.toUpperCase(x); //만약 소문자라면 대문자로
          else answer += Character.toLowerCase(x); //아니라면 대문자이니 소문자로
        }
        
        return answer;
    }
}