class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for (int i=0; i<array.length; i++){
            for(int j=0; j<array.length-1; j++){
                
                if(array[j] > array[j+1]){
                    
                    int x = array[j];
                    array[j] = array[j+1];
                    array[j+1] = x;
                    
                }
            }

            
        }
        
        int center = (array.length-1) / 2;
        
        answer = array[center];
        
        
        return answer;
    }
}