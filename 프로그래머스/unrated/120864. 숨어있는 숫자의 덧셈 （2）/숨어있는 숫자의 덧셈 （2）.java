class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String a = my_string.replaceAll("[a-zA-Z]"," ");
        String[] b = a.split(" ");
        
        for(int i=0; i<b.length; i++){
            if(!b[i].equals(""))
            answer += Integer.parseInt(b[i]);
        }
        return answer;
    }
}