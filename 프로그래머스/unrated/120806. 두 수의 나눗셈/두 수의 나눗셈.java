class Solution {
    public int solution(int num1, int num2) {
        int answer = -1;
        
        boolean val = (num1 >= 0 && num1 <= 100 && num2 >= 0 && num2 <= 100);
            
        if(val){
         answer = division(num1, num2);
        }
        
        return answer;
    }
    
    public int division(int num1, int num2){
        double answer = (double) num1 / num2 * 1000;
        
        return (int) answer;
    }
}