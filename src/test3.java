import java.util.*;

class Calc{

    int n;

    Calc(int n){
        this.n = n;
    }

    int calculate(){
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        return sum;
    }
}

public class test3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while(true){
            System.out.println("5~10까지의 정수를 입력하시오");
            int n = s.nextInt();
            if(n>=5&&n<=10){
                Calc c = new Calc(n);
                int sum = c.calculate();
                System.out.printf("1에서 %d까지의 홀수의 합은=%d \n",n,sum);
            }
            else{
                System.out.println("5~10까지의 정수가 아닙니다.");
                continue;
            }
        }
    }
}