import java.util.*;

class Solution {
     
    public List<Integer> solution(int n) {
        int sqrt = (int) Math.sqrt(n); //제곱근
        List<Integer> answer = new ArrayList<>();
        for(int i=1; i<=sqrt; i++){
            if(n%i == 0){
                answer.add(i);
                if(n/i != i){
                    answer.add(n/i);
                }
            }    
        }
        Collections.sort(answer);

        
        return answer;
    }
}