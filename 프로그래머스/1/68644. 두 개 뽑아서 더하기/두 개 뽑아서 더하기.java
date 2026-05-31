import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        //list
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];

                if (!list.contains(sum)) {
                    list.add(sum);
                }
            }
        }
        Collections.sort(list); //Arrays.sort 오름차순 정렬
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        //set
//         Set<Integer> treeSet = new TreeSet<>(); // 중복 제거 + 오름차순 정렬

//         for (int i = 0; i < numbers.length; i++) {
//             for (int j = i + 1; j < numbers.length; j++) {
//                 treeSet.add(numbers[i] + numbers[j]);
//             }
//         }

//         int[] answer = new int[treeSet.size()];
//         int index = 0;
//         for (int number : treeSet) {
//             answer[index++] = number;
//         }
        return answer;
    }
}