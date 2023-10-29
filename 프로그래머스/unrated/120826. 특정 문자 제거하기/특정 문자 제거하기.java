class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        String[] str = my_string.split("");
        for(int i=0; i<my_string.length(); i++){
            if(!str[i].equals(letter))
                answer += str[i];
        }
        return answer;
    }
}