// class Solution {
    
//     public static int fact(int n) {

//     if (n <= 1)

//         return n;

//     else 

//         return fact(n-1) * n;

// 	}
    
//     public int solution(int balls, int share) {
        
//         int answer = fact(balls) / (fact(balls-share) * fact(share));
        
//         return answer;
//     }
// }

import java.math.BigInteger;

class Solution {
    public BigInteger solution(int balls, int share) {
        BigInteger bigBalls = BigInteger.valueOf(balls);
        BigInteger bigShare = BigInteger.valueOf(share);
        
    	return factorial(bigBalls).divide(factorial(bigBalls.subtract(bigShare)).multiply(factorial(bigShare)));
    }
    
    public static BigInteger factorial(BigInteger n) {
        if(n.intValue() <= 1)
        {
        	return BigInteger.ONE;
        }
    
        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
}