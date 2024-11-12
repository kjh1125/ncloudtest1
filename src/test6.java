public class test6 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};

        int b[]={6,7,8,9,10};

        int c=add(a,5);

        int d=add(a,5,b);

        System.out.println(c);

        System.out.println(d);
    }

    private static int add(int[] a, int i, int[] b) {
        int t = i;
        int sum = 0;
        for(int i2=0; i2<t; i2++){
            sum += a[i2] + b[i2];
        }
        return sum;
    }

    private static int add(int[] a, int i) {
        int t = i;
        int sum = 0;
        for(int i2=0; i2<t; i2++){
            sum += a[i2];
        }
        return sum;
    }

}