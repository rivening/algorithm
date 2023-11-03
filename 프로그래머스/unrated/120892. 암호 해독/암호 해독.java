class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] cipherArray = cipher.split("");
        for(int i =1; i<cipherArray.length+1; i++){
            if(i%code == 0){
                answer += cipherArray[i-1];
            }
        }
        return answer;
    }
}