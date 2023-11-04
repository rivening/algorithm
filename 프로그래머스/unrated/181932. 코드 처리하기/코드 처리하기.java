class Solution {
    public String solution(String code) {
        String answer = "";
        String mode = "0";
        String[] c = code.split("");
        
        for(int i =0 ; i<c.length; i++){
            if(c[i].equals("1") && mode.equals("1")) mode = "0";
            else if (c[i].equals("1") && mode.equals("0")) mode = "1";
            
            if(i%2 ==0 && mode.equals("0") && !c[i].equals("1"))
                answer += c[i];
            else if (i%2 == 1 && mode.equals("1") && !c[i].equals("1"))
                answer += c[i];
        }
        
        if(answer.length() ==0)
            answer = "EMPTY";
        
        
        return answer;
    }
}