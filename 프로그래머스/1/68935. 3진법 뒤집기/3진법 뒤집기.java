class Solution {
    public int solution(int n) {
        String digit = "";
        int answer = -1;
        while(n > 0){
            digit += n % 3;
            n /= 3;
        }
        answer = Integer.parseInt(digit, 3); //0021을 3진법으로 인식하여 int변형
        return answer;
    }
}