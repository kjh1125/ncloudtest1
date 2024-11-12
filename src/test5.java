import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
            int ary[];
            ary=make();
            for(int i=0;i<ary.length;i++) {
                System.out.println(ary[i] + " ");
            }
    }

    private static int[] make() {
        int temp[] = new int[5]; //배열 생성
        for(int i=0;i<temp.length;i++)
        {
            temp[i] = i;
        }
        return temp;
    }

}