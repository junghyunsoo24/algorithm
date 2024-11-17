import java.util.Scanner;

public class Solution {
    static char[][] arr; // 글자판
    static final int L = 100;

    public static boolean solve(int l) {
        for (int i = 0; i < L; i++) {
            for (int j = 0; j <= (L - l); j++) {
                if (solveRow(i, j, l) || solveColumn(j, i, l)) return true;
            }
        }
        return false;
    }

    // 가로 탐색
    public static boolean solveRow(int i, int j, int l) {
        for (int k = 0; k < l / 2; k++) {
            if (arr[i][j + k] != arr[i][j + l - 1 - k]) return false;
        }
        return true;
    }

    // 세로 탐색
    public static boolean solveColumn(int i, int j, int l) {
        for (int k = 0; k < l / 2; k++) {
            if (arr[i + k][j] != arr[i + l - 1 - k][j]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int test = 0; test < 10; test++) {
            int t = sc.nextInt(); // 테스트 케이스 번호
            sc.nextLine(); // 개행 문자 제거

            arr = new char[L][L];

            // 글자판 입력
            for (int i = 0; i < L; i++) {
                String str = sc.nextLine(); // 한 줄 입력받기
                for (int j = 0; j < L; j++) {
                    arr[i][j] = str.charAt(j);
                }
            }

            for (int i = L; i > 0; i--) {
                if (solve(i)) {
                    System.out.println("#" + t + " " + i);
                    break;
                }
            }
        }

        sc.close();
    }
}
