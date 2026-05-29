class Solution {
    public long solution(int price, int money, int count) {
        long sum = 0; //money 최대가 1,000,000,000라 안전하게 long 사용
        long answer = -1;
        
        for(int i = 1; i <= count; i++){
            sum += i * price;
        }
        answer = sum - money;
        

        return answer > 0 ? answer : 0;
    }
}