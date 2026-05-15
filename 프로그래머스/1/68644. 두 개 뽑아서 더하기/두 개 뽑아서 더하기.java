import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> treeSet = new TreeSet<>(); //중복x, 정렬
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                treeSet.add(numbers[i] + numbers[j]);
            }
        }
        
        int[] answer = new int[treeSet.size()];
        int index = 0;
        for(int number: treeSet){
            answer[index++] = number;
        }
        return answer;
    }
}