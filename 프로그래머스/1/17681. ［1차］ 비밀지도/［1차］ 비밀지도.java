class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++){
            String binary = Integer.toBinaryString(arr1[i] | arr2[i]); //2진수로 변환 31->11111
            binary = String.format("%" + n + "s", binary).replace(" ", "0"); //n자리수, 첫공백을 0으로 변환
            answer[i] = binary.replace("1", "#").replace("0", " "); //1은 #, 0은 " "으로 변환
        }
        
        return answer;
    }
}