import java.util.*;

public class test4 {
    public static void main(String[] args) {

        int[][] ary=new int[3][3];

        high(ary,3,3);

    }

    private static void high(int[][] ary, int row, int col) {
        Scanner s = new Scanner(System.in);
        int max = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("숫자를 입력하세요:");
                ary[i][j] = s.nextInt();
                if (ary[i][j] > max) {
                    max = ary[i][j];
                }
            }
        }
        System.out.println("가장 큰 수: " + max);
    }
}