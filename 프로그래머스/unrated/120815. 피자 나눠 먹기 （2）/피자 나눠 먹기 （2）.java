class Solution {
    public int solution(int n) {
        int answer = 0;
        int a=6;
        int b=n;
        int x = 0; 
        
        if(n%6 ==0){
            answer = n/6;
        }else{
            while(b != 0){
                x = a%b;
                
                a = b;
                b = x;
            }
            answer = n/a;
        }
        return answer;
    }
}