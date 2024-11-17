import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int t = sc.nextInt(); // 테스트 케이스 개수 입력
        sc.nextLine(); // 개행 문자 소비

        for (int i = 0; i < t; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            String a = parts[0]; // 숫자
            int n = Integer.parseInt(parts[1]); // 진법

            // 숫자를 BigInteger로 변환하고 지정된 진법으로 변환
            String cur = new BigInteger(a).toString(n);

            // 회문인지 확인
            if (isPalindrome(cur)) {
                sb.append("1\n");
            } else {
                sb.append("0\n");
            }
        }

        System.out.print(sb.toString());
        sc.close();
    }

    // 회문 확인 함수
    private static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
