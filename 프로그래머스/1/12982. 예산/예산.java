import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int currentBudget = 0;
        int answer = 0;
        for(int i = 0; i < d.length; i++){
            if(currentBudget < budget && (d[i] + currentBudget <= budget)){
                currentBudget += d[i];
                answer ++;
            }
        }
        return answer;
    }
}