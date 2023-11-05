class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] arr = my_string.split("");
        String a = arr[num1];
        String b = arr[num2];
        
        arr[num1] = b ; 
        arr[num2] = a ;
        
        for(int i = 0; i< arr.length; i++){
            answer += arr[i];
        }
        
        return answer;
    }
}