class Solution {
    public int[] solution(int[] numbers) {
        
        int leng = numbers.length;
        int[] answer = new int[leng];

        for (int i = 0 ; i < numbers.length; i++){
            answer[i] =numbers[i]*2;
        }

        
        return answer;
    }
}