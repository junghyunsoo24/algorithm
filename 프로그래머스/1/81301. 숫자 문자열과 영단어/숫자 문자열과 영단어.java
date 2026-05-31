class Solution {
    public int solution(String s) {
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < words.length; i++){
            s = s.replace(words[i], String.valueOf(i)); //"zero"->"0"
        }
        return Integer.parseInt(s); //"1478"->1478
    }
}