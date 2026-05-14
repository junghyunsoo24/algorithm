class Solution {
    public int solution(int left, int right) {
        int answer = 0; 
        for(int i = left; i <= right; i++){
            //제곱근이 있으면 약수의 개수가 홀수
            int sqrt = (int) Math.sqrt(i);
            if(sqrt * sqrt == i) {
                answer -= i;
            } else {
                answer += i;
            }
        }
        return answer;
    }
}