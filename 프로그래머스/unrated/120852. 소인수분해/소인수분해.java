import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        
         List<Integer> list = new ArrayList<>();
        int idx = 0;
        
        for (int i=2 ; i<=n; i++){
            
            if (n % i == 0){
                list.add(i);
            }
            
            while (n % i == 0) {
                n /= i;
            }

        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<answer.length; i++){
            answer[i] += list.get(i) ;
        }
            
        

        return answer;
    }
}

// class Solution {
//     public String solution(String cipher, int code) {
//         String answer = "";
//         for(int i=code-1; i<cipher.length(); i+=code){
//             answer += cipher.substring(i, i+1);
//         }
//         return answer;
//     }
// }