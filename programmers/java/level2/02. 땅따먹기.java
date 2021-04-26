import java.util.*;

class Solution {
    int solution(int[][] land) {
        /**
        [1, 2, 3, 5]
        [5 + MAX(2,3,5), 6 + MAX(1,3,5), 7 + MAX(1,2,5), 8 + MAX(1,2,3)]
        -> [10, 11, 12, 11]
        [4,   3,  2,  1]
        [4 + MAX(11,12,11), 3 + MAX(10,12,11), 2 + MAX(10,11,11), 1 + MAX(10,11,12)]
        -> [16, 15, 13, 13]
        **/
        
        for(int i=1; i<land.length; i++) {
           land[i][0] += Math.max( land[i-1][1], Math.max(land[i-1][2] , land[i-1][3]) );
           land[i][1] += Math.max( land[i-1][0], Math.max(land[i-1][2] , land[i-1][3]) );
           land[i][2] += Math.max( land[i-1][1], Math.max(land[i-1][0] , land[i-1][3]) );                       
           land[i][3] += Math.max( land[i-1][0], Math.max(land[i-1][1] , land[i-1][2]) );   
        }
        
        Arrays.sort(land[land.length-1]);
        return land[land.length-1][3];

    }  
}
