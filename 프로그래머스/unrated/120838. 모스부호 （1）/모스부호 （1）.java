class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = { 
            ".-","-...","-.-.","-..",".","..-.",
            "--.","....","..",".---","-.-",".-..",
            "--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-",
            "-.--","--.."
        };
        
        String[] letters = letter.split(" ");
        
        for(String s : letters){
            for(int i =0; i<morse.length; i++){
                if(s.equals(morse[i])){
                    answer += Character.toString(i + 97);
                }
            }
        }
        return answer;
    }
}